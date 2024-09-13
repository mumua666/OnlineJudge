#include <iostream>
using namespace std;

int main(void)
{

    int n;
    cin >> n;

    int magic[n][n];
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            magic[i][j] = 0;
        }
    }
    int count = 0;
    int x = 0, y = n / 2;
    while (count++ < n * n)
    {
        magic[x][y] = count;
        int temp_x = (x - 1 + n) % n;
        int temp_y = (y + 1) % n;
        if (magic[temp_x][temp_y] == 0)
        {
            x = temp_x;
            y = temp_y;
        }
        else
        {
            x = (x + 1) % n;
        }
    }

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cout << magic[i][j] << " ";
        }
        cout << endl;
    }

    return 0;
}