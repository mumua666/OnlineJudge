#include <iostream>
using namespace std;

int main(void)
{
    int num;
    cin >> num;
    bool conditionA = num % 2 == 0;
    bool conditionB = num > 4 && num <= 12;
    bool isALike = conditionA && conditionB;
    bool isBlike = conditionA | conditionB;
    bool isCLike = conditionA ^ conditionB;
    bool isDLike = !conditionA && !conditionB;
    cout << isALike << " " << isBlike << " " << isCLike << " " << isDLike << endl;
    return 0;
}