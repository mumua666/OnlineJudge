#include <iostream>
#include <algorithm>
#include <math.h>
#include <vector>
#include <string>

using namespace std;

// class Solution
// {
// public:
//     int maxAbsoluteSum(vector<int> &nums)
//     {
//         int maxPre = 0, minPre = 0, sum = 0, answer = 0;
//         for (int i = 0; i < nums.size(); i++)
//         {
//             sum += nums[i];
//             answer = max(answer, sum - minPre);
//             maxPre = max(maxPre, sum);
//             answer = max(answer, maxPre - sum);
//             minPre = min(minPre, sum);
//         }
//         return answer;
//     }
// };

// class Solution
// {
// public:
//     int maxAbsoluteSum(vector<int> &nums)
//     {
//         int positiveMax = 0, negativeMin = 0;
//         int positiveSum = 0, negativeSum = 0;
//         for (int num : nums)
//         {
//             positiveSum += num;
//             positiveMax = max(positiveMax, positiveSum);
//             positiveSum = max(0, positiveSum);
//             negativeSum += num;
//             negativeMin = min(negativeMin, negativeSum);
//             negativeSum = min(0, negativeSum);
//         }
//         return max(positiveMax, -negativeMin);
//     }
// };

// dp
// class Solution
// {
// public:
//     int maxAbsoluteSum(vector<int> &nums)
//     {
//         int ans = 0, f_max = 0, f_min = 0;
//         for (int x : nums)
//         {
//             f_max = max(f_max, 0) + x;
//             f_min = min(f_min, 0) + x;
//             ans = max(ans, max(f_max, -f_min));
//         }
//         return ans;
//     }
// };

// prefix sum
class Solution
{
public:
    int maxAbsoluteSum(vector<int> &nums)
    {
        int s = 0, mx = 0, mn = 0;
        for (int x : nums)
        {
            s += x;
            mx = max(mx, s);
            mn = min(mn, s);
        }
        return mx - mn;
    }
};

int main(void)
{

    return 0;
}