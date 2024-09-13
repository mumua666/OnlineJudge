#include <iostream>

using namespace std;

int main(void)
{
    string str;
    cin >> str;
    int power = 1, sum = 0;
    for (int i = 0; i < str.size() - 1; i++)
    {
        if (str[i] != '-')
        {
            sum += (str[i] - '0') * power++;
        }
    }

    char tail = sum % 11 == 10 ? 'X' : sum % 11 + '0';
    if (tail == str[str.length() - 1])
    {
        cout << "Right" << endl;
    }
    else
    {
        str[str.length() - 1] = tail;
        cout << str << endl;
    }
    return 0;
}