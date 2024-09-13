#include <iostream>
#include <algorithm>
#include <math.h>
#include <vector>
#include <string>
#include <iomanip>
using namespace std;

int main(void)
{

    int n;
    cin >> n;
    double price = 0;
    if (n <= 150)
    {
        price = n * 0.4463;
    }
    else if (n <= 400)
    {
        price = 150 * 0.4463 + (n - 150) * 0.4663;
    }
    else
    {
        price = 150 * 0.4463 + 250 * 0.4663 + (n - 400) * 0.5663;
    }
    cout << fixed << setprecision(1) << price << endl;
    return 0;
}