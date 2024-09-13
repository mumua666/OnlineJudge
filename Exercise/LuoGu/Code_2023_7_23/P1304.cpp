#include <iostream>
#include <algorithm>
#include <math.h>
#include <vector>
#include <string>

using namespace std;

bool is_prime(int n)
{

    for (int i = 2; i <= (int)sqrt(n); i++)
    {
        if (n / i * i == n)
        {
            return false;
        }
    }

    return true;
}

int main(void)
{

    int n;
    cin >> n;

    for (int i = 4; i <= n; i += 2)
    {
        if (is_prime(i - 2))
        {
            cout << i << "=" << 2 << "+" << i - 2 << endl;
        }
        else
        {
            for (int j = 3; j <= i / 2; j += 2)
            {
                if (is_prime(j) && is_prime(i - j))
                {
                    cout << i << "=" << j << "+" << i - j << endl;
                    break;
                }
            }
        }
    }

    return 0;
}