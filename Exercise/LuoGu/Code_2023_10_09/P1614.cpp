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

    int n, m;
    cin >> n >> m;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    int sum = 0;
    for (int i = 0; i < m; i++)
    {
        sum += arr[i];
    }
    int min_sum = sum;
    for (int i = 0, j = m; j < n; i++, j++)
    {
        sum += arr[j];
        sum -= arr[i];
        min_sum = min_sum < sum ? min_sum : sum;
    }
    cout << min_sum << endl;
    return 0;
}