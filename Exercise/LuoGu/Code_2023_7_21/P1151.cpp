#include <iostream>
#include <algorithm>
#include <math.h>
#include <vector>
#include <string>

using namespace std;

int main(void)
{
    int start = (int)1e4, end = (int)3e4;
    int k;
    cin >> k;
    int sub1, sub2, sub3;
    bool has_solution = false;
    for (int i = start; i <= end; i++)
    {
        sub1 = i / 100;
        sub2 = i % 10000 / 10;
        sub3 = i % 1000;
        if (sub1 % k == 0 && sub2 % k == 0 && sub3 % k == 0)
        {
            cout << i << endl;
            has_solution = true;
        }
    }

    if (!has_solution)
    {
        cout << "No" << endl;
    }

    return 0;
}