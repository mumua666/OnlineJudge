#include <iostream>
#include <algorithm>
#include <math.h>
#include <vector>
#include <string>
#include <string.h>

using namespace std;

int main(void)
{
    int l, m;
    cin >> l >> m;
    int line[l + 1];

    memset(line, 0, l + 1);

    int start, end;

    while (m--)
    {
        cin >> start >> end;
        for (int i = start; i <= end; i++)
        {
            line[i] = -1;
        }
    }

    int cnt = 0;
    for (int i = 0; i <= l; i++)
    {
        if (line[i] != -1)
        {
            cnt++;
        }
    }

    cout << cnt << endl;

    return 0;
}