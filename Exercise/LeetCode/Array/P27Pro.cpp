#include <iostream>
#include <algorithm>
#include <math.h>
#include <vector>
#include <string>

using namespace std;
class Solution
{
public:
    int removeElement(vector<int> &nums, int val)
    {
        int leftIndex = 0;
        int rightIndex = nums.size() - 1;
        while (leftIndex <= rightIndex)
        {
            while (leftIndex <= rightIndex && nums[leftIndex] != val)
            {
                leftIndex++;
            }

            while (leftIndex <= rightIndex && nums[rightIndex] == val)
            {
                rightIndex--;
            }

            if (leftIndex <= rightIndex)
            {
                nums[leftIndex++] = nums[rightIndex--];
            }
        }

        return leftIndex;
    }
};
int main(void)
{

    return 0;
}