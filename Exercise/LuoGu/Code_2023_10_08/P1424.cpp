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
    int x, n;
    cin >> x >> n;
    long distance = 0;

    int cnt = 1;
    while (cnt <= n)
    {
        int week_day = x % 7;
        bool is_swim = week_day != 0 && week_day != 6;
        if (is_swim)
        {
            distance += 250;
        }
        x++, cnt++;
    }
    cout << distance << endl;

    return 0;
}