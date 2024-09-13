#include <iostream>
#include <algorithm>
#include <math.h>
#include <vector>
#include <string>

using namespace std;

int main(void)
{

    int n;
    cin >> n;
    int arr[n];
    bool start = false;
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    int cnt = 0;
    for (int i = 1; i < n; i++)
    {
        if (arr[i] < arr[i - 1] && !start)
        {
            start = true;
        }
        else if (arr[i] > arr[i - 1] && start)
        {
            start = false;
            cnt++;
        }
    }
    cout << cnt << endl;

    return 0;
}