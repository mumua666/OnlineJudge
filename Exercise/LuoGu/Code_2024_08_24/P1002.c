#include <stdio.h>

int main(void)
{
    int n, m, x, y;
    scanf("%d %d %d %d", &n, &m, &x, &y);
    // printf("%d %d %d %d\n", n, m, x, y);
    long long arr[n + 1][m + 1];
    for (int i = 0; i <= n; i++)
    {
        for (int j = 0; j <= m; j++)
        {
            arr[i][j] = 0;
        }
    }
    arr[x][y] = -1;
    if (x - 2 >= 0)
    {
        if (y - 1 >= 0)
        {
            arr[x - 2][y - 1] = -1;
        }
        if (y + 1 <= m)
        {
            arr[x - 2][y + 1] = -1;
        }
    }
    if (x - 1 >= 0)
    {
        if (y - 2 >= 0)
        {
            arr[x - 1][y - 2] = -1;
        }
        if (y + 2 <= m)
        {
            arr[x - 1][y + 2] = -1;
        }
    }
    if (x + 1 <= n)
    {
        if (y - 2 >= 0)
        {
            arr[x + 1][y - 2] = -1;
        }
        if (y + 2 <= m)
        {
            arr[x + 1][y + 2] = -1;
        }
    }
    if (x + 2 <= n)
    {
        if (y - 1 >= 0)
        {
            arr[x + 2][y - 1] = -1;
        }
        if (y + 1 <= m)
        {
            arr[x + 2][y + 1] = -1;
        }
    }
    for (int i = 1; i <= n && arr[i][0] != -1; i++)
    {
        arr[i][0] = 1;
    }
    for (int j = 1; j <= m && arr[0][j] != -1; j++)
    {
        arr[0][j] = 1;
    }
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= m; j++)
        {
            if (arr[i][j] != -1)
            {
                if (arr[i - 1][j] != -1)
                {
                    arr[i][j] += arr[i - 1][j];
                }
                if (arr[i][j - 1] != -1)
                {
                    arr[i][j] += arr[i][j - 1];
                }
            }
        }
    }
    printf("%lld\n", arr[n][m]);
    return 0;
}