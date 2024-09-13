#include <iostream>
#include <string>
#include <cstring>
#include <cmath>
#include <iomanip>
#include <algorithm>
#include <list>
#include <set>

using namespace std;

int main(void)
{

    int n, m;
    cin >> n >> m;
    int square = 0;
    int rectangle = 0;
    /**
     *  calculate square
     */
    // get minimum edge
    int min = n > m ? m : n;
    // edge start form 1 to min
    for (int i = 1; i <= min; i++)
    {
        square += (n - i + 1) * (m - i + 1);
    }
    /**
     * calculate rectangle
     */
    // initialize width(i) and height(j), start from 1 to n and 1 to m
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= m; j++)
        {
            // count only the shape is rectangle
            if (i != j)
            {
                rectangle += (n - i + 1) * (m - j + 1);
            }
        }
    }

    cout << square << " " << rectangle << endl;

    return 0;
}