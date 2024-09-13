#include <iostream>
#include <algorithm>
#include <math.h>
#include <vector>
#include <string>

using namespace std;
class Solution
{
public:
    bool isPerfectSquare(int num)
    {
        long middle = 1;

        while (middle * middle < num)
        {
            if (middle * 2 < 0)
            {
                break;
            }
            middle *= 2;
            if (middle * middle == num)
            {
                return true;
            }
        }

        for (long i = middle / 2; i <= middle; i++)
        {
            if (i * i == num)
            {
                return true;
            }
            if (i * i > num)
            {
                return false;
            }
        }

        return false;
    }
};
int main(void)
{
    cout << Solution().isPerfectSquare(16) << endl;
    return 0;
}