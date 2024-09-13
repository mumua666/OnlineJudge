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

    int s, v;
    cin >> s >> v;
    int time_road = s / v + 10;
    if (s / v * v != s)
    {
        time_road++;
    }
    int time_start = 8 * 60 - time_road;

    if (time_start < 0)
    {
        time_start += 24 * 60;
    }

    int hour = time_start / 60;
    int minute = time_start % 60;

    printf("%02d:%02d\n", hour, minute);

    return 0;
}