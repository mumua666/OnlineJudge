#include <iostream>

using namespace std;

int main(void)
{

    int n;
    int num;
    cin >> n >> num;
    int arr[n];
    int nums[10] = {0};

    int x;
    for (int i = 1; i <= n; i++)
    {
        x = i;
        while (x)
        {
            nums[x % 10]++;
            x /= 10;
        }
    }

    cout << nums[num] << endl;
    return 0;
}