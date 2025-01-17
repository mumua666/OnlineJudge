#include <iostream>
#include <algorithm>
#include <math.h>
#include <vector>
#include <string>

using namespace std;

class Solution
{
public:
    void reverseString(vector<char> &s)
    {
        for (int i = 0, j = s.size() - 1; i < j; i++, j--)
            s[i] ^= s[j], s[j] ^= s[i], s[i] ^= s[j];
    }
};

int main(void)
{

    return 0;
}