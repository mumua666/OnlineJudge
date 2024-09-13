#include <iostream>

using namespace std;

int main(void)
{
    int arr[3];
    for (int i = 0; i < 3; i++)
    {
        cin >> arr[i];
    }
    for (int i = 0; i < 3; i++)
    {
        for (int j = i + 1; j < 3; j++)
        {
            if (arr[i] > arr[j])
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    char ch[3];
    cin >> ch[0] >> ch[1] >> ch[2];
    cout << arr[ch[0] - 'A'] << " " << arr[ch[1] - 'A'] << " " << arr[ch[2] - 'A'] << endl;
    return 0;
}