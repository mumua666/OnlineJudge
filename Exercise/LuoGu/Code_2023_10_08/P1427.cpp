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

    int arr[101];
    int index = 0;
    while (true)
    {
        cin >> arr[index];
        if (arr[index] == 0)
        {
            index--;
            break;
        }
        index++;
    }
    for (int i = index; i >= 0; i--)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
    return 0;
}