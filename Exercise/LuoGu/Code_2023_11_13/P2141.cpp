#include <iostream>

using namespace std;

int main(void)
{

    int n;
    cin >> n;
    // space complexity O(n)
    int arr[n];
    bool isSum[n];
    for (int i = 0; i < n; i++)
    {
        isSum[i] = false;
        cin >> arr[i];
    }

    // time complexity O(n^3)
    for (int i = 0; i < n; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            int sum = arr[i] + arr[j];
            for (int k = 0; k < n; k++)
            {
                if (k != i && k != j && arr[k] == sum)
                {
                    isSum[k] = true;
                }
            }
        }
    }

    int cnt = 0;
    for (int i = 0; i < n; i++)
    {
        if (isSum[i])
        {
            cnt++;
        }
    }
    cout << cnt << endl;
    return 0;
}