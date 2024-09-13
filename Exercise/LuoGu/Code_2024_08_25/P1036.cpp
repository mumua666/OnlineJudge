#include <iostream>
#include <vector>
#include <algorithm>
#include <numeric>
#include <cmath>

using namespace std;

// 判断一个数是否为素数
bool isPrime(int num)
{
    if (num < 2)
        return false;
    for (int i = 2; i <= sqrt(num); i++)
    {
        if (num % i == 0)
            return false;
    }
    return true;
}

// 使用回溯法计算k个数的所有组合的和
void findCombinations(const vector<int> &nums, int k, int start, int currentSum, int &primeCount, vector<int> &combination)
{
    if (combination.size() == k)
    {
        if (isPrime(currentSum))
        {
            primeCount++;
        }
        return;
    }

    for (int i = start; i < nums.size(); i++)
    {
        combination.push_back(nums[i]);
        findCombinations(nums, k, i + 1, currentSum + nums[i], primeCount, combination);
        combination.pop_back();
    }
}

int main()
{
    int n, k;
    cin >> n >> k;

    vector<int> nums(n);
    for (int i = 0; i < n; i++)
    {
        cin >> nums[i];
    }

    int primeCount = 0;
    vector<int> combination;
    findCombinations(nums, k, 0, 0, primeCount, combination);

    cout << primeCount << endl;

    return 0;
}
