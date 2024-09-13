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
    while (n != 1)
    {
        n /= 2;
        cnt++;
    }
    cout << cnt << endl;

    return 0;
}