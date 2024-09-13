#include <iostream>
using namespace std;

int main(void)
{

    int y, m;
    cin >> y >> m;

    bool is_leap_year = y % 400 == 0 || y % 4 == 0 && y % 100 != 0;

    int day = 28;
    if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
    {
        day += 3;
    }
    else if (m == 2)
    {

        day += is_leap_year ? 1 : 0;
    }
    else
    {
        day += 2;
    }

    cout << day << endl;

    return 0;
}