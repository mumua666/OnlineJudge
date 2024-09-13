#include <iostream>
#include <algorithm>
#include <math.h>
#include <vector>
#include <string>

using namespace std;

int main(void)
{

    int n = 7;
    int arr_class[n], arr_outclass[n], arr_sum[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr_class[i] >> arr_outclass[i];
        arr_sum[i] = arr_class[i] + arr_outclass[i];
    }

    int max_index = 0;
    for (int i = 0; i < n; i++)
    {
        if (arr_sum[i] > arr_sum[max_index])
        {
            max_index = i;
        }
    }

    if (arr_sum[max_index] > 8)
    {
        cout << max_index + 1 << endl;
    }
    else
    {
        cout << 0 << endl;
    }

    return 0;
}