#include <iostream>
using namespace std;

/*
Author: Linux_Mumu
Date: 2023-12-5
Description: Luogu P5730 CPP solve code.
*/

int main(void)
{

    int n;
    cin >> n;

    char ch_num[n];                 // store input number string
    char ch_nums[5][n * 3 + n - 1]; // store output number chars

    // store number char 0 - 9
    char single_char_nums[10][5][3] = {
        // 0
        {
            {'X', 'X', 'X'},
            {'X', '.', 'X'},
            {'X', '.', 'X'},
            {'X', '.', 'X'},
            {'X', 'X', 'X'},
        },
        // 1
        {
            {'.', '.', 'X'},
            {'.', '.', 'X'},
            {'.', '.', 'X'},
            {'.', '.', 'X'},
            {'.', '.', 'X'},
        },
        // 2
        {
            {'X', 'X', 'X'},
            {'.', '.', 'X'},
            {'X', 'X', 'X'},
            {'X', '.', '.'},
            {'X', 'X', 'X'},
        },
        // 3
        {
            {'X', 'X', 'X'},
            {'.', '.', 'X'},
            {'X', 'X', 'X'},
            {'.', '.', 'X'},
            {'X', 'X', 'X'},
        },
        // 4
        {
            {'X', '.', 'X'},
            {'X', '.', 'X'},
            {'X', 'X', 'X'},
            {'.', '.', 'X'},
            {'.', '.', 'X'},
        },
        // 5
        {
            {'X', 'X', 'X'},
            {'X', '.', '.'},
            {'X', 'X', 'X'},
            {'.', '.', 'X'},
            {'X', 'X', 'X'},
        },
        // 6
        {
            {'X', 'X', 'X'},
            {'X', '.', '.'},
            {'X', 'X', 'X'},
            {'X', '.', 'X'},
            {'X', 'X', 'X'},
        },
        // 7
        {
            {'X', 'X', 'X'},
            {'.', '.', 'X'},
            {'.', '.', 'X'},
            {'.', '.', 'X'},
            {'.', '.', 'X'},
        },
        // 8
        {
            {'X', 'X', 'X'},
            {'X', '.', 'X'},
            {'X', 'X', 'X'},
            {'X', '.', 'X'},
            {'X', 'X', 'X'},
        },
        // 9
        {
            {'X', 'X', 'X'},
            {'X', '.', 'X'},
            {'X', 'X', 'X'},
            {'.', '.', 'X'},
            {'X', 'X', 'X'},
        }

    };

    for (int i = 0; i < n; i++)
    {
        cin >> ch_num[i];
        int index = ch_num[i] - '0'; // calculate integer number start from 0

        // cout << index << endl;

        // for (int j = 0; j < 5; j++)
        // {
        //     for (int k = 0; k < 3; k++)
        //     {
        //         cout << single_char_nums[index][j][k];
        //     }
        //     cout << endl;
        // }
        // cout << "===================================" << endl;

        /*
         append number char to output number chars
        */
        for (int j = 0; j < 5; j++)
        {
            for (int k = 0; k < 3; k++)
            {
                ch_nums[j][i * 4 + k] = single_char_nums[index][j][k];
            }
            if (i < n - 1)
            {
                ch_nums[j][i * 4 + 3] = '.';
            }
        }

        // for (int j = 0; j < 5; j++)
        // {
        //     for (int k = 0; k < 3; k++)
        //     {
        //         cout << ch_nums[j][i * 4 + k];
        //     }
        //     cout << endl;
        // }
        // cout << "===================================" << endl;
        // for (int j = 0; j < 5; j++)
        // {
        //     for (int k = 0; k < 3; k++)
        //     {
        //         cout << ch_nums[j][k];
        //     }
        //     cout << endl;
        // }
        // cout << "===================================" << endl;
    }

    // output result
    for (int i = 0; i < 5; i++)
    {
        for (int j = 0; j < 4 * n - 1; j++)
        {
            cout << ch_nums[i][j];
        }
        cout << endl;
    }

    return 0;
}