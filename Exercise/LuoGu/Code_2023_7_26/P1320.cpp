#include <iostream>
#include <algorithm>
#include <math.h>
#include <vector>
#include <string>

using namespace std;

int main(void)
{
    int digit, count = 0;
    bool is_one = false, has_show = false;
    string num_str;

    while (cin >> num_str)
    {
        if (!has_show)
        {
            cout << num_str.length() << " ";
            has_show = true;
        }
        for (int i = 0; i < num_str.length(); i++)
        {
            digit = num_str[i] - '0';
            if (digit == 1)
            {
                if (!is_one)
                {
                    is_one = true;
                    cout << count << " ";
                    count = 1;
                }
                else
                {
                    count++;
                }
            }
            else
            {
                if (is_one)
                {
                    is_one = false;
                    cout << count << " ";
                    count = 1;
                }
                else
                {
                    count++;
                }
            }
        }
    }
    cout << count << endl;

    return 0;
}