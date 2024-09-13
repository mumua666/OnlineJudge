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
    bool isOne = false;
    int num, count = 0;
    while (cin >> num)
    {
        if (isOne)
        {
            isOne = false;
            while (num--)
            {
                cout << "1";
                count++;
                if (count % n == 0)
                {
                    cout << endl;
                }
            }
        }
        else
        {
            isOne = true;
            while (num--)
            {
                cout << "0";
                count++;
                if (count % n == 0)
                {
                    cout << endl;
                }
            }
        }
    }

    return 0;
}