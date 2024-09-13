#include <iostream>
#include <math.h>
using namespace std;
int main()
{
    int T;
    cin >> T;
    if (T == 1)
    {
        cout << "I love Luogu!";
    }
    else if (T == 2)
    {
        cout << 2 + 4 << " " << 10 - 2 - 4;
    }
    else if (T == 3)
    {
        cout << 14 / 4 << endl;
        cout << 14 / 4 * 4 << endl;
        cout << 14 - 14 / 4 * 4 << endl;
    }
    else if (T == 4)
    {
        printf("%6.3f\n", 500 / 3.0);
    }
    else if (T == 5)
    {
        cout << (260 + 220) / (12 + 20) << endl;
    }
    else if (T == 6)
    {
        cout << sqrt(6 * 6 + 9 * 9) << endl;
    }
    else if (T == 7)
    {
        int balance = 100;
        balance += 10;
        cout << balance << endl;
        balance -= 20;
        cout << balance << endl;
        balance -= balance;
        cout << balance << endl;
    }
    else if (T == 8)
    {
        double pi = 3.141593;
        int r = 5;
        cout << 2 * pi * r << endl;
        cout << pi * r * r << endl;
        cout << 4.0 / 3 * pi * r * r * r << endl;
    }
    else if (T == 9)
    {
        int end = 1;
        end = (end + 1) * 2;
        end = (end + 1) * 2;
        end = (end + 1) * 2;
        cout << end << endl;
    }
    else if (T == 10)
    {
        cout << 9 << endl;
    }
    else if (T == 11)
    {
        cout << 100.0 / (8 - 5) << endl;
    }
    else if (T == 12)
    {
        cout << 'M' - 'A' + 1 << endl;
        cout << (char)('A' + 17) << endl;
    }
    else if (T == 13)
    {
        double pi = 3.141593;
        double volume = 4.0 / 3 * pi * (pow(4, 3) + pow(10, 3));
        cout << (int)(pow(volume, 1.0 / 3)) << endl;
    }
    else if (T == 14)
    {
        int price = 110, num = 10;
        int total = ++price * --num;
        while (total < 3500)
        {
            total = --price * ++num;
        }
        while (total >= 3500)
        {
            total = --price * ++num;
        }
        cout << ++price << endl;
    }
    return 0;
}