#include <iostream>
using namespace std;

int main(void)
{
    int n;
    cin >> n;
    const int prizeSize = 7;
    int prizeNums[prizeSize];
    for (int i = 0; i < prizeSize; i++)
    {
        cin >> prizeNums[i];
    }
    int buyNums[n][prizeSize];
    // define count array
    int matchNums[n];

    for (int i = 0; i < n; i++)
    {
        // initialize the counter to 0
        matchNums[i] = 0;
        for (int j = 0; j < prizeSize; j++)
        {
            cin >> buyNums[i][j];
            // loop prizeNums to find if any num match
            for (int k = 0; k < prizeSize; k++)
            {
                // if find a match num, add counter and break the loop
                if (buyNums[i][j] == prizeNums[k])
                {
                    matchNums[i]++;
                    break;
                }
            }
        }
    }
    int rankNums[prizeSize];
    for (int i = 0; i < prizeSize; i++)
    {
        rankNums[i] = 0;
    }
    for (int i = 0; i < n; i++)
    {
        switch (matchNums[i])
        {
        case 7:
            rankNums[0]++;
            break;
        case 6:
            rankNums[1]++;
            break;
        case 5:
            rankNums[2]++;
            break;
        case 4:
            rankNums[3]++;
            break;
        case 3:
            rankNums[4]++;
            break;
        case 2:
            rankNums[5]++;
            break;
        case 1:
            rankNums[6]++;
            break;
        }
    }

    for (int i = 0; i < prizeSize; i++)
    {
        cout << rankNums[i] << " ";
    }
    cout << endl;
    return 0;
}