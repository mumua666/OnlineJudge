#include <iostream>
#include <string>
#include <cstring>
#include <cmath>
#include <iomanip>

using namespace std;

int main(void)
{
    // 读数
    int n;
    cin >> n;
    int nums[n];

    // 数组清零
    for (int i = 0; i < n; i++)
    {
        nums[i] = 0;
    }

    // 循环填数以及输出
    for (int i = 0; i < n; i++)
    {
        // 从后向前避免数组被覆盖
        for (int j = i; j >= 0; j--)
        {
            if (j == i || j == 0)
            {
                nums[j] = 1;
            }
            else
            {
                nums[j] = nums[j] + nums[j - 1];
            }
        }
        for (int j = 0; j <= i; j++)
        {
            cout << nums[j] << " ";
        }
        cout << endl;
    }

    return 0;
}