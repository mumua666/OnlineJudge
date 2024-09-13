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
    int min = 0x7f7f7f7f, val;
    for (int i = 0; i < n; i++)
    {
        cin >> val;
        min = min < val ? min : val;
    }
    cout << min << endl;
    return 0;
}