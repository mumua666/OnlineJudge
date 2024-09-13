#include <iostream>
#include <string>
#include <cstring>
#include <cmath>
#include <iomanip>

using namespace std;

int main(void)
{
    int n;
    cin >> n;
    int nums[n][n];

    // 清零数组
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            nums[i][j] = 0;
        }
    }

    // 右，下，左，上循环填数
    nums[0][0] = 1;
    for (int i = 0, j = 0, tot = 1; tot < n * n;)
    {
        while (++j < n && !nums[i][j])
        {
            nums[i][j] = ++tot;
        }
        --j;
        while (++i < n && !nums[i][j])
        {
            nums[i][j] = ++tot;
        }
        --i;
        while (--j >= 0 && !nums[i][j])
        {
            nums[i][j] = ++tot;
        }
        ++j;
        while (--i < n && !nums[i][j])
        {
            nums[i][j] = ++tot;
        }
        ++i;
    }

    // 格式输出
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cout << setw(3) << nums[i][j];
        }
        cout << endl;
    }
    return 0;
}