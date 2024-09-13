#include <iostream>
#include <algorithm>
#include <math.h>
#include <vector>
#include <string>

using namespace std;

int main(void)
{

    string str;
    cin >> str;
    int boy_cnt = 0, girl_cnt = 0;
    string boy_start = "", girl_start = "";
    string BOY = "boy", GIRL = "girl";
    for (char i : str)
    {
        if (i != '.')
        {
            if (BOY.find(i) != string::npos)
            {
                girl_start = "";
                if (BOY.find(boy_start + i) != string::npos)
                {
                    if (boy_start == "")
                    {
                        boy_cnt++;
                    }
                    boy_start += i;
                }
                else
                {
                    boy_cnt++;
                    boy_start = i;
                }
            }
            else
            {
                boy_start = "";
                if (GIRL.find(girl_start + i) != string::npos)
                {
                    if (girl_start == "")
                    {
                        girl_cnt++;
                    }
                    girl_start += i;
                }
                else
                {
                    girl_cnt++;
                    girl_start = i;
                }
            }
        }
    }
    cout << boy_cnt << endl
         << girl_cnt << endl;
    return 0;
}