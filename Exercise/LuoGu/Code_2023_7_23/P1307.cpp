#include <iostream>
#include <algorithm>
#include <math.h>
#include <vector>
#include <string>

using namespace std;

int main(void)
{

    int n;
    cin >> n;

    int num = 0;
    while (n)
    {
        num *= 10;
        num += n % 10;
        n /= 10;
    }

    cout << num << endl;

    return 0;
}