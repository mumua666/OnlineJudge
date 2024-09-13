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
    int cnt = 1;
    for (int i = n; i > 0; i--)
    {
        for (int j = i; j > 0; j--)
        {
            printf("%02d", cnt++);
        }
        cout << endl;
    }

    return 0;
}