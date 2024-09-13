#include <iostream>
#include <string>
#include <cstring>
#include <cmath>
#include <iomanip>
#include <algorithm>
#include <list>
#include <set>

using namespace std;

int main(void)
{

    int n, k;
    cin >> n >> k;
    int cnt1 = 0, cnt2 = 0, sum1 = 0, sum2 = 0;
    for (int i = 1; i <= n; i++)
    {
        if (i % k)
        {
            cnt2++;
            sum2 += i;
        }
        else
        {
            cnt1++;
            sum1 += i;
        }
    }
    printf("%.1f %.1f\n", sum1 * 1.0 / cnt1, sum2 * 1.0 / cnt2);
    return 0;
}