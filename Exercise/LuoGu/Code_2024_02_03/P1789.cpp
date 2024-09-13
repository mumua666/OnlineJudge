#include <iostream>
#include <string>
#include <cstring>
#include <cmath>
#include <iomanip>

using namespace std;

int main(void)
{

    // 读数
    int n, m, k;
    cin >> n >> m >> k;
    int nums[n + 1][n + 1];

    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= n; j++)
        {
            nums[i][j] = 0;
        }
    }

    // 循环填充火把照明点
    int x, y;
    for (int i = 0; i < m; i++)
    {
        cin >> x >> y;
        nums[x][y] = 1;
        // y方向
        if (y - 1 >= 1)
        {
            nums[x][y - 1] = 1;
        }
        if (y - 2 >= 1)
        {
            nums[x][y - 2] = 1;
        }
        if (y + 1 <= n)
        {
            nums[x][y + 1] = 1;
        }
        if (y + 2 <= n)
        {
            nums[x][y + 2] = 1;
        }

        // x方向
        if (x - 1 >= 1)
        {
            nums[x - 1][y] = 1;
        }
        if (x - 2 >= 1)
        {
            nums[x - 2][y] = 1;
        }
        if (x + 1 <= n)
        {
            nums[x + 1][y] = 1;
        }
        if (x + 2 <= n)
        {
            nums[x + 2][y] = 1;
        }

        // 四角方向
        if (x - 1 >= 1 && y - 1 >= 1)
        {
            nums[x - 1][y - 1] = 1;
        }
        if (x - 1 >= 1 && y + 1 <= n)
        {
            nums[x - 1][y + 1] = 1;
        }
        if (x + 1 <= n && y - 1 >= 1)
        {
            nums[x + 1][y - 1] = 1;
        }
        if (x + 1 <= n && y + 1 <= n)
        {
            nums[x + 1][y + 1] = 1;
        }
    }

    // 循环填充萤石照明点
    for (int i = 0; i < k; i++)
    {
        cin >> x >> y;
        for (int j = x - 2; j <= x + 2; j++)
        {
            for (int k = y - 2; k <= y + 2; k++)
            {
                if (j >= 1 && j <= n && k >= 1 && k <= n)
                {
                    nums[j][k] = 1;
                }
            }
        }
    }

    // 统计输出
    int cnt = 0;
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= n; j++)
        {
            if (!nums[i][j])
            {
                cnt++;
            }
        }
    }
    cout << cnt << endl;

    return 0;
}