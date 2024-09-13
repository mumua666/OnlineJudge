#include <iostream>
#include <algorithm>
#include <math.h>
#include <vector>
#include <string>

using namespace std;
bool is_prime(int n)
{
    int factor_min = (int)sqrt(n);
    for (int i = 2; i <= factor_min; i++)
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
    int factor_min = (int)sqrt(n);

    int prime_arr[factor_min];
    int index = 0;

    for (int i = 2; i <= factor_min; i++)
    {
        if (is_prime(i))
        {
            prime_arr[index++] = i;
        }
    }

    for (int i = 0; i < index; i++)
    {
        if (n / prime_arr[i] * prime_arr[i] == n)
        {
            cout << n / prime_arr[i] << endl;
            break;
        }
    }

    return 0;
}