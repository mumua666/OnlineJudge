#include <iostream>
#include <string>
#include <cstring>
#include <cmath>
#include <iomanip>

using namespace std;

int main(void)
{

    string line;
    // cin >> line; // cin 以空格，换行符结束
    getline(cin, line);

    int count = 0;
    for (int i = 0; i < line.length(); i++)
    {
        if (line[i] != ' ' && line[i] != '\n')
        {
            count++;
        }
    }

    cout << count << endl;

    return 0;
}