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

    while (n--)
    {
        int cmd;

        cin >> cmd;

        switch (cmd)
        {
        case 1:
        {
            string postfix;
            cin >> postfix;
            str += postfix;
            cout << str << endl;
        }
        break;

        case 2:
        {
            int start, size;
            cin >> start >> size;
            str = str.substr(start, size);
            cout << str << endl;
        }
        break;

        case 3:
        {
            int pos;
            string newStr;
            cin >> pos >> newStr;
            str.insert(pos, newStr);
            cout << str << endl;
        }
        break;

        case 4:
        {
            string subStr;
            cin >> subStr;
            int pos = str.find(subStr);
            cout << pos << endl;
        }
        break;
        default:
            cout << "ERROR! Wrong Operation" << endl;
            break;
        }
    }
    return 0;
}