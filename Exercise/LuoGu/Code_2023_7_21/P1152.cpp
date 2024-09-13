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
    int diff;
    cin >> arr[0];

    int arr_check[n];
    for (int i = 0; i < n; i++)
    {
        arr_check[i] = -1;
    }

    for (int i = 1; i < n; i++)
    {
        cin >> arr[i];
        diff = arr[i] - arr[i - 1];
        diff = diff > 0 ? diff : -diff;
        if (diff < n)
        {
            arr_check[diff] = 1;
        }
    }

    bool is_jolly = true;

    for (int i = 1; i < n; i++)
    {
        if (arr_check[i] == -1)
        {
            cout << "Not jolly" << endl;
            is_jolly = false;
            break;
        }
    }
    if (is_jolly)
    {
        cout << "Jolly" << endl;
    }

    return 0;
}