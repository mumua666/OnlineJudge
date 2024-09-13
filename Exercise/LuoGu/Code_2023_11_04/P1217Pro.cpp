#include <iostream>
#include <cmath>

using namespace std;
bool is_prime(int n)
{
    for (int i = 2; i <= sqrt(n); i++)
    {
        if (n / i * i == n)
        {
            return false;
        }
    }
    return true;
}

bool is_loop_num(int n)
{
    int nums[10];
    int index = 0;
    while (n)
    {
        nums[index++] = n % 10;
        n /= 10;
    }
    for (int i = 0, j = index - 1; i < j; i++, j--)
    {
        if (nums[i] != nums[j])
        {
            return false;
        }
    }

    return true;
}

int main(void)
{

    int a, b;
    cin >> a >> b;
    if (b <= 1e5)
    {
        for (int i = a; i <= b; i++)
        {
            if (is_loop_num(i) && is_prime(i))
            {
                cout << i << endl;
            }
        }
    }
    else
    {
        for (int i = a; i <= 1e5; i++)
        {
            if (is_loop_num(i) && is_prime(i))
            {
                cout << i << endl;
            }
        }

        for (int d1 = 1; d1 <= 9; d1 += 2)
        {
            for (int d2 = 0; d2 <= 9; d2++)
            {
                for (int d3 = 0; d3 <= 9; d3++)
                {
                    // 6位回文数
                    int loop_num6 = d1 * 100000 + d2 * 10000 + d3 * 1000 + d3 * 100 + d2 * 10 + d1;
                    if (loop_num6 >= a && loop_num6 <= b && is_prime(loop_num6))
                    {
                        cout << loop_num6 << endl;
                    }
                    for (int d4 = 0; d4 <= 9; d4++)
                    {
                        // 7位回文数
                        int loop_num7 = d1 * 1000000 + d2 * 100000 + d3 * 10000 + d4 * 1000 + d3 * 100 + d2 * 10 + d1;
                        if (loop_num7 >= a && loop_num7 <= b && is_prime(loop_num7))
                        {
                            cout << loop_num7 << endl;
                        }
                        // 8位回文数
                        int loop_num8 = d1 * 10000000 + d2 * 1000000 + d3 * 100000 + d4 * 10000 + d4 * 1000 + d3 * 100 + d2 * 10 + d1;
                        if (loop_num8 >= a && loop_num8 <= b && is_prime(loop_num8))
                        {
                            cout << loop_num8 << endl;
                        }
                    }
                }
            }
        }
    }
    return 0;
}