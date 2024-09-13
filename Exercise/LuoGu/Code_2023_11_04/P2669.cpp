#include <iostream>

using namespace std;

int main(void)
{

    int k;
    cin >> k;

    int coins = 0, days = 0, index = 1;
    while (days + index <= k)
    {
        days += index;
        coins += index * index;
        index++;
    }

    while (days < k)
    {
        days++;
        coins += index;
    }
    cout << coins << endl;
    return 0;
}