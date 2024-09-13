#include <iostream>
#include <math.h>
#include <algorithm>
using namespace std;
typedef long long LL;
const int M = 1e5 + 10;
LL a[M];
LL n, N;
int main()
{
    cin >> n >> N;
    LL r = N / (n + 1); // 得到r值
    // 输入序列A，a[0]默认为0
    for (int i = 1; i <= n; i++)
        cin >> a[i];
    a[++n] = N; // 将N加入到序列A中

    LL sum = 0;
    for (int i = 1; i <= n; i++)
    {
        LL left = a[i - 1];  // 该段区间的左端点
        LL right = a[i] - 1; // 该段区间的右端点，注意-1

        LL l_ = left / r; // 判断左右两端点之间的距离，决定计算方式
        LL r_ = right / r;
        // 如果左端点与有端点除以r的值相等，即该段区间的g(i)相等
        if (l_ == r_)
        {
            // 当前区间的长度为right-left+1;
            // 由于g(i)值相等，f(i)值相等，则可以直接求解该段区间的sum
            // 注意第i段区间的,f(i)值为i-1
            sum += labs(l_ - i + 1) * (right - left + 1);
        }
        // 如果不想等，说明该区间内g(i)的值不想等，需要再次分段
        else
        {
            sum += (r - left % r) % r * labs(l_ - i + 1); // 处理左边部分，当left%r!=0时，我们优先处理该部分
            sum += (right % r) * labs(r_ - i + 1);        // 同理处理右边部分，当right%r!=0时，我们优先处理该部分，使得剩下的区间端点都可以整除r
            LL l__ = left + (r - left % r) % r;           // 更新左端点，比如5%3=2，我们需要将5更新为6，则需要+2，即+(r-left%r)%r,注意%r,因为当前端点可能刚好可整除r
            LL r__ = right - right % r;                   // 更新右端点，比如5%3=2，我们需要将5更新为3，则需要-2，直接 -right%r
            // 参考样例3，我们需要对右端点进行特判，当其可以整除r时，不应该放在当前段内
            if (r__ % r == 0)
            {
                sum += labs(r__ / r - i + 1); // 对最右一个端点进行特判
            }
            // 将该区间分为r长度的单位段，进行处理，只需要满足<=r__-1
            while (l__ <= r__ - 1)
            {
                sum += r * labs(l__ / r - i + 1); // 每个单位段的长度为r
                l__ += r;                         // 跳到下一个单位段
            }
        }
    }
    cout << sum << endl;
    return 0;
}
