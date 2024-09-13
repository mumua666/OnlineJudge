#include <iostream>
#include <algorithm>
#include <math.h>
#include <vector>
#include <string>

using namespace std;
class Solution
{
public:
    string get_new_string(string str)
    {
        int j = 0;
        for (int i = 0; i < str.size(); i++)
        {
            if (str[i] != '#')
            {
                str[j++] = str[i];
            }
            else
            {
                j ? str[j--] = str[i] : str[j] = str[i];
            }
        }
        return str.substr(0, j);
    }
    bool backspaceCompare(string s, string t)
    {
        return get_new_string(s) == get_new_string(t);
    }
};
int main(void)
{

    cout << Solution().get_new_string("a##c") << endl;

    return 0;
}