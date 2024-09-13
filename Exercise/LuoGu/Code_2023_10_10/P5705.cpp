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
    string str;
    cin >> str;
    string str_reverse = str;
    for (int i = 0, j = str_reverse.size() - 1; j >= 0;)
    {
        str_reverse[j--] = str[i++];
    }
    cout << str_reverse << endl;
    return 0;
}