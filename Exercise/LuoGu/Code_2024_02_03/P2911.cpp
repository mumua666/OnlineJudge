#include <iostream>
#include <string>
#include <cstring>
#include <cmath>
#include <iomanip>

using namespace std;

int main(void)
{

    int s1, s2, s3;
    cin >> s1 >> s2 >> s3;
    int maxSize = s1 + s2 + s3 + 1;

    int cnt[maxSize];
    for (int i = 0; i < maxSize; i++)
    {
        cnt[i] = 0;
    }

    int maxNum = -1;
    for (int i = 1; i <= s1; i++)
    {
        for (int j = 1; j <= s2; j++)
        {
            for (int k = 1; k <= s3; k++)
            {
                int sum = i + j + k;
                cnt[sum]++;
                maxNum = maxNum > cnt[sum] ? maxNum : cnt[sum];
            }
        }
    }

    for (int i = 1; i < maxSize; i++)
    {
        if (cnt[i] == maxNum)
        {
            cout << i << endl;
            break;
        }
    }

    return 0;
}