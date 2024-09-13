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

    int m, n;
    cin >> m >> n;
    long nums[10];
    for (int i = m; i <= n; i++)
    {
        int num = i;
        // loop mod 10 to count number 1 to 9
        while (num)
        {
            int index = num % 10;
            nums[index]++;
            num /= 10;
        }
    }
    for (int i = 0; i < 10; i++)
    {
        cout << nums[i] << " ";
    }
    cout << endl;

    return 0;
}