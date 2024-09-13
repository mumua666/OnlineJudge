#include <bits/stdc++.h>
using namespace std;
int num[109][109], n;
int main()
{
    num[1][1] = 1; // 初始为1
    cin >> n;
    for (int i = 1, j = 1, tot = 1; tot < n * n;)
    { // 一直填到n*n个数填完
        while (++j <= n && !num[i][j])
            num[i][j] = ++tot;
        --j; // 向右
        while (++i <= n && !num[i][j])
            num[i][j] = ++tot;
        --i; // 向下
        while (--j > 0 && !num[i][j])
            num[i][j] = ++tot;
        ++j; // 向左
        while (--i > 0 && !num[i][j])
            num[i][j] = ++tot;
        ++i; // 向上
        // 注意上面几行末尾的处理(--j这种)，不满足前面条件才会退出，这样进入下一个循环时实际上变量会有点问题。
        // 举个例子：第一行写完，j=n+1，然后进入第二个while就根本不是在填表了（歪了）。
    }
    for (int i = 1; i <= n; ++i, cout << endl)
        for (int j = 1; j <= n; ++j)
            cout << setw(3) << num[i][j]; // 输出
    return 0;
}