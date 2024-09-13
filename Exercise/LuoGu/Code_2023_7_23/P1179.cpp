#include <iostream>
#include <algorithm>
#include <math.h>
#include <vector>
#include <string>

using namespace std;

int main(void)
{

    int l, r;
    cin >> l >> r;
    int num, count = 0, low_digit;

    for (int i = l; i <= r; i++)
    {
        num = i;
        while (num)
        {
            low_digit = num % 10;
            num /= 10;
            if (low_digit == 2)
            {
                count++;
            }
        }
    }
    cout << count << endl;
    return 0;
}