#include <iostream>
#include <algorithm>
#include <math.h>
#include <vector>
#include <string>

using namespace std;

int main(void)
{

    int n = 12;
    int save = 0, balance = 0, plan, rem;
    bool is_risk = false;
    int min_month;
    for (int i = 0; i < n; i++)
    {
        cin >> plan;
        if (is_risk)
            continue;
        rem = balance + 300 - plan;
        if (rem < 0)
        {
            min_month = i + 1;
            is_risk = true;
        }
        save += rem / 100 * 100;
        balance = rem - rem / 100 * 100;
    }
    if (is_risk)
    {
        cout << -min_month << endl;
    }
    else
    {
        cout << save * 1.2 + balance << endl;
    }

    return 0;
}