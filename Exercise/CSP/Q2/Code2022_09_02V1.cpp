#include <iostream>
#include <algorithm>
using namespace std;
int book[31];
int sum[32] = {0};
int minmoney = 300010;
void dfs(int now, int s, int n, int x)
{
    if (now == n)
    {
        return;
    }
    if (s + sum[n] - sum[now] < x)
    {
        return;
    }
    if (s + book[now] >= x)
    {
        minmoney = min(minmoney, book[now] + s);
    }
    else
    {
        dfs(now + 1, s + book[now], n, x);
    }
    dfs(now + 1, s, n, x);
}
int main()
{
    int n, x;
    cin >> n >> x;
    for (int i = 0; i < n; ++i)
    {
        cin >> book[i];
        sum[i + 1] = sum[i] + book[i];
    }
    dfs(0, 0, n, x);
    cout << minmoney;
}