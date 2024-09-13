#include <iostream>

using namespace std;

int main(void)
{

    int sum;
    cin >> sum;
    int num, price;
    int min_price = 0x7f7f7f7f;
    for (int i = 0; i < 3; i++)
    {
        cin >> num >> price;
        int total_num = 0, total_price = 0;
        while (total_num < sum)
        {
            total_num += num;
            total_price += price;
        }
        min_price = min_price < total_price ? min_price : total_price;
    }
    cout << min_price << endl;
    return 0;
}