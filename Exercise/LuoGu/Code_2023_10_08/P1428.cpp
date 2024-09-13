#include <iostream>
#include <string>
#include <cstring>
#include <cmath>
#include <iomanip>
#include <algorithm>
#include <list>
#include <set>

using namespace std;

int main(void)
{

    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
        int cnt = 0;
        for (int j = 0; j < i; j++)
        {
            if (arr[j] < arr[i])
            {
                cnt++;
            }
        }
        cout << cnt << " ";
    }
    cout << endl;

    return 0;
}