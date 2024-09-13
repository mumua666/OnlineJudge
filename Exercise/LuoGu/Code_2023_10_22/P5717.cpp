#include <iostream>

using namespace std;

int main(void)
{
    int a, b, c;
    cin >> a >> b >> c;

    if (a < b)
    {
        int temp = a;
        a = b;
        b = temp;
    }
    if (a < c)
    {
        int temp = a;
        a = c;
        c = temp;
    }

    int a_square = a * a;
    int bc_square = b * b + c * c;

    if (a >= b + c)
    {
        cout << "Not triangle" << endl;
    }
    else
    {
        if (a_square == bc_square)
        {
            cout << "Right triangle" << endl;
        }
        if (a_square < bc_square)
        {
            cout << "Acute triangle" << endl;
        }
        if (a_square > bc_square)
        {
            cout << "Obtuse triangle" << endl;
        }
        if (a == b || a == c || b == c)
        {
            cout << "Isosceles triangle" << endl;
        }
        if (a == b && b == c)
        {
            cout << "Equilateral triangle" << endl;
        }
    }
    return 0;
}