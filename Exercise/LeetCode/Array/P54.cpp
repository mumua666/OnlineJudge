#include <iostream>
#include <string>
#include <cstring>
#include <cmath>
#include <iomanip>
#include <algorithm>
#include <list>
#include <set>

using namespace std;

class Solution
{
public:
    vector<int> spiralOrder(vector<vector<int>> &matrix)
    {
        int n = matrix.size();
        int m = matrix[0].size();
        vector<int> res(n * m, 0);  // 定义结果矩阵
        int startx = 0, starty = 0; // 定义每循环一个圈的起始位置
        int loop = n / 2;           // 每个圈循环几次，例如n为奇数3，那么loop = 1 只是循环一圈，矩阵中间的值需要单独处理
        int mid = n / 2;            // 矩阵中间的位置，例如：n为3， 中间的位置就是(1，1)，n为5，中间位置为(2, 2)
        int count = 0;              // 记录结果矩阵的索引
        int offset = 1;             // 需要控制每一条边遍历的长度，每次循环右边界收缩一位
        int i, j;
        while (loop--)
        {
            i = startx;
            j = starty;

            // 下面开始的四个for就是模拟转了一圈
            // 模拟填充上行从左到右(左闭右开)
            for (j = starty; j < m - offset && count < n * m; j++)
            {
                res[count++] = matrix[i][j];
            }
            // 模拟填充右列从上到下(左闭右开)
            for (i = startx; i < n - offset && count < n * m; i++)
            {
                res[count++] = matrix[i][j];
            }
            // 模拟填充下行从右到左(左闭右开)
            for (; j > starty && count < n * m; j--)
            {
                res[count++] = matrix[i][j];
            }
            // 模拟填充左列从下到上(左闭右开)
            for (; i > startx && count < n * m; i--)
            {
                res[count++] = matrix[i][j];
            }

            // 第二圈开始的时候，起始位置要各自加1， 例如：第一圈起始位置是(0, 0)，第二圈起始位置是(1, 1)
            startx++;
            starty++;

            // offset 控制每一圈里每一条边遍历的长度
            offset += 1;
        }

        // 如果n为奇数的话，需要单独给矩阵最中间的位置赋值
        if (n % 2)
        {
            for (j = starty; j <= m - offset && count < n * m; j++)
            {
                res[count++] = matrix[mid][j];
            }
        }
        return res;
    }
};

int main()
{
    int n = 3, m = 1;
    vector<vector<int>> matrix(n, vector<int>(m, 0));
    int value = 7;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            matrix[i][j] = value++;
        }
    }
    Solution ans;
    vector<int> result = ans.spiralOrder(matrix);
    for (auto &i : result)
    {
        cout << i << " ";
    }
    cout << endl;
    return 0;
}