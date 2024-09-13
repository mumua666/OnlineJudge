#include <iostream>
#include <algorithm>
#include <math.h>
#include <vector>
#include <string>

using namespace std;

int main(void)
{

    int apple[10];
    int height;
    for (int i = 0; i < 10; i++)
    {
        cin >> apple[i];
    }
    cin >> height;
    height += 30;
    int cnt = 0;
    for (int i = 0; i < 10; i++)
    {
        if (apple[i] <= height)
        {
            cnt++;
        }
    }

    cout << cnt << endl;

    return 0;
}