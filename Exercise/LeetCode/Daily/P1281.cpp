#include <iostream>
#include <algorithm>
#include <math.h>
#include <vector>
#include <string>

using namespace std;

class Solution
{
public:
    int subtractProductAndSum(int n)
    {
        int product = 1, sum = 0;
        while (n)
        {
            product *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        cout << product - sum << endl;
    }
};

int main(void)
{
    int n;
    cin >> n;

    int product = 1, sum = 0;
    while (n)
    {
        product *= n % 10;
        sum += n % 10;
        n /= 10;
    }
    cout << product - sum << endl;
    return 0;
}