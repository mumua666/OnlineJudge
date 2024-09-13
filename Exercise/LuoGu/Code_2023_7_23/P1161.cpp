#include <iostream>
#include <algorithm>
#include <math.h>
#include <vector>
#include <string>

using namespace std;
#define MAX_SIZE 2000001
int main(void)
{

    int n;
    cin >> n;
    double a, t;
    bool is_on[MAX_SIZE];
    for (int i = 0; i < MAX_SIZE; i++)
    {
        is_on[i] = false;
    }

    int index;
    for (int i = 0; i < n; i++)
    {
        cin >> a >> t;
        for (int j = 1; j <= t; j++)
        {
            index = int(j * a);
            // cout << index << endl;
            is_on[index] = !is_on[index];
        }
        // cout << is_on[1] << endl;
    }

    for (int i = 1; i < MAX_SIZE; i++)
    {
        if (is_on[i])
        {
            cout << i << endl;
            break;
        }
    }

    return 0;
}
