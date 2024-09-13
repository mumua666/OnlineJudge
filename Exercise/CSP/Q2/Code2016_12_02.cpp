#include <iostream>
#include <algorithm>
using namespace std;

int tax(int x)
{
    int a[8] = {0, 1500, 4500, 9000, 35000, 55000, 80000, 0x3f3f3f};
    float b[8] = {0, 0.03, 0.1, 0.2, 0.25, 0.3, 0.35, 0.45};
    int tax = 0;
    if (x <= 3500)
    {
        return 0;
    }
    else
    {
        int n = x - 3500;
        for (int j = 1; j < 8; j++)
        {
            if (n > a[j - 1])
            {
                tax += (min(a[j] - a[j - 1], n - a[j - 1])) * b[j];
            }
            else
                break;
        }
    }
    return tax;
}
int main()
{
    int t;
    cin >> t;
    for (int s = 100; s <= 200000; s += 100)
    {
        if (t == s - tax(s))
        {
            cout << s;
            break;
        }
    }
    return 0;
}
