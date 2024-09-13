#include <iostream>
#include <algorithm>
#include <math.h>
#include <vector>
#include <string>

using namespace std;

int main(void)
{
    double distance, step = 2, sum_distance = 0;
    int step_cnt = 0;
    cin >> distance;
    while (sum_distance < distance)
    {
        step_cnt++;
        sum_distance += step;
        step *= 0.98;
    }
    cout << step_cnt << endl;
    return 0;
}