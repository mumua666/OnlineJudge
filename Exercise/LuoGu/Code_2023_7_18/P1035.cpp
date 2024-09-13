#include <iostream>
#include <algorithm>
#include <math.h>
#include <vector>
#include <string>

using namespace std;

int main(void)
{

    int k;
    cin >> k;

    double sum = 0;
    int cnt = 0;

    while (sum <= k)
    {
        cnt++;
        sum += 1.0 / cnt;
    }

    cout << cnt << endl;

    return 0;
}