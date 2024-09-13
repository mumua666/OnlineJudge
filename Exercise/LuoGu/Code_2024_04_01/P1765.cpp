#include <iostream>
#include <string>
#include <cstring>
#include <cmath>
#include <iomanip>

using namespace std;

int findTimes(char c)
{
    char charMaps[8][4] = {
        {'a', 'b', 'c'},
        {'d', 'e', 'f'},
        {'g', 'h', 'i'},
        {'j', 'k', 'l'},
        {'m', 'n', 'o'},
        {'p', 'q', 'r', 's'},
        {'t', 'u', 'v'},
        {'w', 'x', 'y', 'z'},
    };

    for (int i = 0; i < 8; i++)
    {
        for (int j = 0; j < 4; j++)
        {
            if (c == charMaps[i][j])
            {
                return j + 1;
            }
        }
    }

    return -1;
}

int main(void)
{

    string line;
    getline(cin, line);

    int count = 0;

    for (char c : line)
    {
        count += c == ' ' ? 1 : findTimes(c);
    }

    cout << count << endl;
    return 0;
}