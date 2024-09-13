#include <iostream>
using namespace std;

int get_MCD(int a, int b)
{
    int rem = a % b;
    while (rem)
    {
        a = b;
        b = rem;
        rem = a % b;
    }
    return b;
}
int main(void)
{

    int a, b, c;
    cin >> a >> b >> c;

    int min = a < b ? a : b;
    min = min < c ? min : c;
    int max = a > b ? a : b;
    max = max > c ? max : c;

    int mcd = get_MCD(max, min);
    cout << min / mcd << "/" << max / mcd << endl;
    return 0;
}