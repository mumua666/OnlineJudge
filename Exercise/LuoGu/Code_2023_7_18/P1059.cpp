#include <iostream>
#include <algorithm>
#include <math.h>
#include <vector>
#include <string>

using namespace std;

bool is_find(int arr[], int size, int num)
{
    for (int i = 0; i < size; i++)
    {
        if (arr[i] == num)
        {
            return true;
        }
    }
    return false;
}
int main(void)
{

    int n;
    cin >> n;
    int random_num[n];
    for (int i = 0; i < n; i++)
    {
        cin >> random_num[i];
    }
    int unique_random_num[n];
    memset(unique_random_num, 0, n);
    int index = 0;

    for (int i = 0; i < n; i++)
    {
        if (!is_find(unique_random_num, n, random_num[i]))
        {
            unique_random_num[index++] = random_num[i];
        }
    }

    for (int i = 0; i < index; i++)
    {
        for (int j = i + 1; j < index; j++)
        {
            if (unique_random_num[i] > unique_random_num[j])
            {
                int temp = unique_random_num[i];
                unique_random_num[i] = unique_random_num[j];
                unique_random_num[j] = temp;
            }
        }
    }

    cout << index << endl;
    for (int i = 0; i < index; i++)
    {
        cout << unique_random_num[i] << ' ';
    }
    cout << endl;

    return 0;
}