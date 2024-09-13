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
    double t;
    int n;
    cin >> t >> n;
    printf("%.3f\n%d\n", t / n, 2 * n);
    return 0;
}