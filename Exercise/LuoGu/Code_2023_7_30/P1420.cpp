#include <iostream>
#include <algorithm>
#include <math.h>
#include <vector>
#include <string>

using namespace std;

int main(void)
{

    int n;
    cin >> n;
    int pre, next, curMax = 1, max = 1;
    cin >> pre;
    n--;
    while (n--)
    {
        cin >> next;
        if (next - pre == 1)
        {
            curMax++;
        }
        else
        {
            max = max > curMax ? max : curMax;
            curMax = 1;
        }
        pre = next;
    }
    max = max > curMax ? max : curMax;
    cout << max << endl;
    return 0;
}