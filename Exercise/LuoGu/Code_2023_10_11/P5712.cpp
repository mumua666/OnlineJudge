#include <iostream>

using namespace std;

int main(void)
{
    int x;
    cin >> x;
    if (x < 2)
    {
        printf("Today, I ate %d apple.\n", x);
    }
    else
    {
        printf("Today, I ate %d apples.\n", x);
    }
    return 0;
}