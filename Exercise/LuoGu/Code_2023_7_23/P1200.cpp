#include <iostream>
#include <algorithm>
#include <math.h>
#include <vector>
#include <string>

using namespace std;

int main(void)
{

    string start_name, group_name;

    cin >> start_name >> group_name;

    long start_num = 1, group_num = 1;
    for (int i = 0; i < start_name.length(); i++)
    {
        start_num *= (start_name[i] - 'A' + 1);
    }
    for (int i = 0; i < group_name.length(); i++)
    {
        group_num *= (group_name[i] - 'A' + 1);
    }

    if (start_num % 47 == group_num % 47)
    {
        cout << "GO" << endl;
    }
    else
    {
        cout << "STAY" << endl;
    }
    return 0;
}