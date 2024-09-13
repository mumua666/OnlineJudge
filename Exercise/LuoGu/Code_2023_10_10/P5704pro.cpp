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

    char ch[5];
    for (int i = 0; i < 5; i++)
    {
        cin >> ch[i];
    }
    for (int i = 4; i >= 0; i--)
    {
        cout << ch[i];
    }
    cout << endl;
    return 0;
}