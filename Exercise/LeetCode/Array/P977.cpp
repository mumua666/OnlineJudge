#include <iostream>
#include <algorithm>
#include <math.h>
#include <vector>
#include <string>

using namespace std;
// class Solution
// {
// public:
//     // vector<int> sortedSquares(vector<int> &nums)
//     // {
//     //     int i = 0, j = nums.size() - 1;
//     //     vector<int> new_nums;
//     //     while (nums[i++] < nums[j--])
//     //     {
//     //     }
//     //     // cout << i << " " << i << endl;
//     //     int left, right;
//     //     while (i < nums.size() && j >= 0)
//     //     {
//     //         // cout << i << " " << j << endl;
//     //         left = nums[j] * nums[j];
//     //         right = nums[i] * nums[i];
//     //         if (left < right)
//     //         {
//     //             new_nums.push_back(left);
//     //             j--;
//     //         }
//     //         else
//     //         {
//     //             new_nums.push_back(right);
//     //             if (i == j)
//     //             {
//     //                 j--;
//     //             }
//     //             i++;
//     //         }
//     //     }
//     //     return new_nums;
//     // }
// };

class Solution
{
public:
    vector<int> sortedSquares(vector<int> &nums)
    {
        int n = nums.size();
        vector<int> ans(n);
        for (int i = 0, j = n - 1, pos = n - 1; i <= j;)
        {
            if (nums[i] * nums[i] > nums[j] * nums[j])
            {
                ans[pos] = nums[i] * nums[i];
                ++i;
            }
            else
            {
                ans[pos] = nums[j] * nums[j];
                --j;
            }
            --pos;
        }
        return ans;
    }
};

int main(void)
{
    vector<int> nums({-4, -1, 0, 3, 10});
    // for (auto &item : nums)
    // {
    //     cout << item << endl;
    // }

    for (auto &item : Solution().sortedSquares(nums))
    {
        cout << item << endl;
    }

    return 0;
}