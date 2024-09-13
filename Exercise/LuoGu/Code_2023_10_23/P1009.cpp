#include <iostream>
#include <string>
#include <cstring>
#include <cmath>
#include <iomanip>
#include <algorithm>
#include <list>
#include <set>

using namespace std;

double frac(int n)
{
    double sum = n;
    while (--n)
    {
        sum *= n;
    }
    return sum;
}
int main(void)
{

    int n;
    cin >> n;
    double sum = 0;
    for (int i = 1; i <= n; i++)
    {
        sum += frac(i);
    }
    printf("%.0lf\n", sum);
    return 0;
}