#include <iostream>
#include <string>
#include <cstring>
#include <cmath>
#include <iomanip>

using namespace std;

int main(void)
{

    int n;
    cin >> n;
    string str;
    cin >> str;

    for (int i = 0; i < str.length(); i++)
    {
        int offSet = ((str[i] - 'a') + n) % 26;
        str[i] = (char)('a' + offSet);
    }

    cout << str << endl;
    return 0;
}