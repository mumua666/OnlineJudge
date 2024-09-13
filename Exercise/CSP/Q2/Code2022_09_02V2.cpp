#include <iostream>
using namespace std;
int s[300010] = {0};
int main()
{
    int n, x;
    cin >> n >> x;
    s[0] = 1;
    for (int i = 0; i < n; ++i)
    {
        int tempnum;
        cin >> tempnum;
        for (int j = 300009; j >= tempnum; --j)
        {
            if (j - tempnum >= 0 and s[j - tempnum] == 1)
            {
                s[j] = 1;
            }
        }
    }
    for (int i = x; i <= 300009; ++i)
    {
        if (s[i] == 1)
        {
            cout << i;
            break;
        }
    }
}