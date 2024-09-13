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

    double s, x;
    cin >> s >> x;
    double distance = 0, speed = 7;
    double start_pos = s - x, end_pos = s + x;
    bool is_enter = false;
    while (true)
    {
        distance += speed;
        speed *= 0.98;
        if (is_enter)
        {
            if (distance <= end_pos)
            {
                cout << 'y' << endl;
            }
            else
            {
                cout << 'n' << endl;
            }
            break;
        }
        if (distance >= start_pos)
        {
            is_enter = true;
        }
    }

    return 0;
}