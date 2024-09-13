#include <iostream>
#include <algorithm>
#include <math.h>
#include <vector>
#include <string>

using namespace std;

// [left, right]
// class Solution
// {
// public:
//     int search(vector<int> &nums, int target)
//     {
//         int left, right, middle;
//         left = 0, right = nums.size() - 1;
//         while (left <= right)
//         {
//             middle = left + (right - left) / 2;
//             if (nums[middle] > target)
//             {
//                 right = middle - 1;
//             }
//             else if (nums[middle] < target)
//             {
//                 left = middle + 1;
//             }
//             else
//             {
//                 return middle;
//             }
//         }

//         return -1;
//     }
// };

//[left, right)
class Solution
{
public:
    int search(vector<int> &nums, int target)
    {
        int left, right, middle;
        left = 0, right = nums.size();
        while (left < right)
        {
            middle = left + (right - left) / 2;
            if (nums[middle] > target)
            {
                right = middle;
            }
            else if (nums[middle] < target)
            {
                left = middle + 1;
            }
            else
            {
                return middle;
            }
        }

        return -1;
    }
};

int main(void)
{

    return 0;
}