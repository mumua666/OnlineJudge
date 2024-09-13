#include <iostream>
#include <string>
#include <cstring>
#include <cmath>
#include <iomanip>
#include <algorithm>
#include <list>
#include <set>

using namespace std;

int main(void)
{

    double a, b, c;
    cin >> a >> b >> c;
    double p = (a + b + c) / 2.0;
    double square = sqrt(p * (p - a) * (p - b) * (p - c));
    printf("%.1f\n", square);

    return 0;
}