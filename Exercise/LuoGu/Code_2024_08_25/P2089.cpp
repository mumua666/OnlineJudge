#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

void combine(int cur_index, int arr[], int sum, vector<string> &num_str, int current_sum)
{
    if (cur_index == 10)
    {
        if (current_sum == sum)
        {
            string str = "";
            for (int i = 0; i < 10; i++)
            {
                str += to_string(arr[i]) + " ";
            }
            num_str.push_back(str);
        }
        return;
    }

    for (int j = 1; j <= 3; j++)
    {
        if (current_sum + j + (9 - cur_index) * 1 > sum)
            continue;
        if (current_sum + j + (9 - cur_index) * 3 < sum)
            continue;
        arr[cur_index] = j;
        combine(cur_index + 1, arr, sum, num_str, current_sum + j);
    }
}

int main(void)
{
    int n;
    cin >> n;

    int arr[10] = {0};
    vector<string> num_str;
    combine(0, arr, n, num_str, 0);

    cout << num_str.size() << endl;
    if (num_str.size() > 0)
    {
        for (const auto &str : num_str)
        {
            cout << str << endl;
        }
    }

    return 0;
}
