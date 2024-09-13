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
    int start_hour, start_min;
    int end_hour, end_min;

    cin >> start_hour >> start_min >> end_hour >> end_min;
    int leap_mins = (end_hour * 60 + end_min) - (start_hour * 60 + start_min);
    cout << leap_mins / 60 << " " << leap_mins % 60 << endl;

    return 0;
}