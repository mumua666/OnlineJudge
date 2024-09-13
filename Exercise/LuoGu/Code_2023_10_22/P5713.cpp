#include <iostream>
using namespace std;

int main(void)
{

    int n;
    cin >> n;
    int local_time = n * 5;
    int luogu_time = n * 3 + 11;
    if (local_time < luogu_time)
    {
        cout << "Local" << endl;
    }
    else
    {
        cout << "Luogu" << endl;
    }

    return 0;
}