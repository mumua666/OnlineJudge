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

int main(void)
{

    int L;
    cin >> L;
    int sum = 0, cnt = 0;
    for (int i = 2;; i++)
    {
        if (sum + i > L)
        {
            break;
        }
        if (is_prime(i) && sum + i <= L)
        {
            sum += i;
            cnt++;
            cout << i << endl;
        }
    }
    cout << cnt << endl;
    return 0;
}