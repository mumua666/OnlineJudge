#include <iostream>
using namespace std;

int main(void)
{

    int m, t, s;
    cin >> m >> t >> s;
    if (t == 0)
    {
        cout << 0 << endl;
    }
    else
    {
        int ate = s / t;
        if (ate * t != s)
        {
            ate++;
        }
        int result = m - ate < 0 ? 0 : m - ate;
        cout << result << endl;
    }
    return 0;
}