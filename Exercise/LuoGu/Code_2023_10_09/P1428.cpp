#include <iostream>
#include <string>
#include <cstring>
#include <cmath>
#include <iomanip>
#include <algorithm>
#include <list>
#include <set>

using namespace std;
int GCD(int n, int m)
{
    if (n < m)
    {
        n ^= m, m ^= n, n ^= m;
    }
    int rem = n % m;
    while (rem)
    {
        n = m;
        m = rem;
        rem = n % m;
    }
    return m;
}
int main(void)
{
    int up1, down1, up2, down2;
    char ch;
    cin >> up1 >> ch >> down1 >> up2 >> ch >> down2;
    int up = up1 * up2;
    int down = down1 * down2;
    int gcd = GCD(up, down);
    cout << down / gcd << " " << up / gcd << endl;
    return 0;
}