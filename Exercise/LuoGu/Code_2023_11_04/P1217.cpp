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
    for (int i = a; i <= b; i++)
    {
        if (is_loop_num(i) && is_prime(i))
        {
            cout << i << endl;
        }
    }
    return 0;
}