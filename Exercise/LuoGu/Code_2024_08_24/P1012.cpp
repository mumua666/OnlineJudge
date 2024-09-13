#include <iostream>
#include <string>

using namespace std;

int main(void)
{
    int n;
    cin >> n;
    string strs[n];
    for (int i = 0; i < n; i++)
    {
        cin >> strs[i];
    }
    for (int i = 0; i < n; i++)
    {
        for (int j = i; j >= 1 && strs[j - 1] < strs[j]; j--)
        {
            string temp = strs[j];
            strs[j] = strs[j - 1];
            strs[j - 1] = temp;
        }
    }
    for (int i = 0; i < n; i++)
    {
        cout << strs[i];
    }
    cout << endl;
    return 0;
}