#include <iostream>

using namespace std;

int main(void)
{
    int a, b, c;
    cin >> a >> b >> c;
    if (a > b)
    {
        int temp = a;
        a = b;
        b = temp;
    }
    if (a > c)
    {
        int temp = a;
        a = c;
        c = temp;
    }
    if (b > c)
    {
        int temp = b;
        b = c;
        c = temp;
    }

    string str;
    cin >> str;

    if (str == "ABC")
    {
        cout << a << " " << b << " " << c << endl;
    }
    else if (str == "ACB")
    {
        cout << a << " " << c << " " << b << endl;
    }
    else if (str == "BAC")
    {
        cout << b << " " << a << " " << c << endl;
    }
    else if (str == "BCA")
    {
        cout << b << " " << c << " " << a << endl;
    }
    else if (str == "CAB")
    {
        cout << c << " " << a << " " << b << endl;
    }
    else if (str == "CBA")
    {
        cout << c << " " << b << " " << a << endl;
    }

    return 0;
}