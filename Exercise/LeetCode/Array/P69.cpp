#include <iostream>
#include <algorithm>
#include <math.h>
#include <vector>
#include <string>

using namespace std;

class Solution
{
public:
    int mySqrt(int x)
    {
        if (x == 1)
            return 1;
        else
        {
            double left = 0, right = x;
            double middle = (left + right) / 2.0;
            double gap = 1e-3, diff;
            while (true)
            {
                diff = middle * middle - x;
                diff = diff > 0 ? diff : -diff;
                if (diff < gap)
                {
                    break;
                }
                if (middle * middle > x)
                {
                    right = middle;
                }
                else
                {
                    left = middle;
                }
                middle = (left + right) / 2.0;
            }
            return (int)middle;
        }
    }
};

int main(void)
{
    cout << Solution().mySqrt(1) << endl;

    return 0;
}