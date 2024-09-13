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
    int n;
    cin >> n;
    int school, out_of_school;
    int last = 0, total = 0;
    while (n--)
    {
        cin >> school >> out_of_school;
        int last = school + out_of_school + last - 8;
        total += last;
    }
    cout << total << endl;
    return 0;
}

// 7
// 5 3 0
// 6 2 0
// 7 2 1
// 5 3 1
// 5 4 2
// 0 4 -2
// 0 6 -4