#include <iostream>
#include <algorithm>
#include <math.h>
#include <vector>
#include <string>

using namespace std;

int main(void)
{

    int n, k;
    cin >> n >> k;
    int total = n;
    while (n >= k)
    {
        total += n / k;
        n = n / k + n - n / k * k;
    }
    cout << total << endl;

    return 0;
}