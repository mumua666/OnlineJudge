#include <iostream>

using namespace std;

int main(void)
{
    int year;
    cin >> year;
    bool isLeapYear = year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    cout << isLeapYear << endl;
    return 0;
}