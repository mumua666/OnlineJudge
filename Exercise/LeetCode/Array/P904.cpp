#include <iostream>
#include <algorithm>
#include <math.h>
#include <vector>
#include <string>

using namespace std;

// class Solution
// {
// public:
//     bool checkTwo(vector<int> nums, int i, int j)
//     {
//         int num = nums[i];
//         int num2;
//         int type = 1;
//         for (int k = i + 1; k <= j; k++)
//         {
//             if (type == 1)
//             {
//                 if (nums[k] != num)
//                 {
//                     num2 = num;
//                     num = nums[k];
//                     type++;
//                 }
//             }
//             else if (type == 2)
//             {
//                 if (nums[k] != num && nums[k] != num2)
//                 {
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
//     int totalFruit(vector<int> &fruits)
//     {
//         int result = -1;
//         for (int i = 0; i < fruits.size(); i++)
//         {
//             for (int j = i; j < fruits.size(); j++)
//             {
//                 if (checkTwo(fruits, i, j))
//                 {
//                     result = result > j - i + 1 ? result : j - i + 1;
//                 }
//                 else
//                 {
//                     break;
//                 }
//             }
//         }
//         return result;
//     }
// };

class Solution
{
public:
    int totalFruit(vector<int> &fruits)
    {
        int n = fruits.size();
        unordered_map<int, int> cnt;

        int left = 0, ans = 0;
        for (int right = 0; right < n; ++right)
        {
            ++cnt[fruits[right]];
            while (cnt.size() > 2)
            {
                auto it = cnt.find(fruits[left]);
                --it->second;
                if (it->second == 0)
                {
                    cnt.erase(it);
                }
                ++left;
            }
            ans = max(ans, right - left + 1);
        }
        return ans;
    }
};

int main(void)
{
    vector<int> nums;
    nums.push_back(0);
    nums.push_back(1);
    nums.push_back(2);
    nums.push_back(2);
    cout << Solution().totalFruit(nums) << endl;
    return 0;
}