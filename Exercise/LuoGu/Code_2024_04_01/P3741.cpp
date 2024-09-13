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

    int len = str.length();
    bool canChange[len];
    for (int i = 0; i < len; i++)
    {
        canChange[i] = true;
    }

    int count = 0;
    // 原字符串匹配到"VK"字符串计数
    for (int i = 0; i < str.length() - 1; i++)
    {
        char curChar = str[i];
        char nextChar = str[i + 1];

        bool isMatch = curChar == 'V' && nextChar == 'K';

        if (isMatch)
        {
            count++;
            canChange[i] = false;
            canChange[i + 1] = false;
        }
    }

    // 原字符串可替换得到"VK"字符串计数
    for (int i = 0; i < str.length() - 1; i++)
    {
        char curChar = str[i];
        char nextChar = str[i + 1];

        bool canCreatePreMatch = curChar != 'V' && nextChar == 'K' && canChange[i];
        bool canCreatePostMatch = curChar == 'V' && nextChar != 'K' && canChange[i + 1];

        if (canCreatePreMatch || canCreatePostMatch)
        {
            count++;
            break;
        }
    }

    cout << count << endl;

    return 0;
}