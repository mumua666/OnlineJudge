#include <iostream>

using namespace std;

int main(void)
{

    double m, h;
    cin >> m >> h;
    double bmi = m / (h * h);
    if (bmi < 18.5)
    {
        cout << "Underweight" << endl;
    }
    else if (bmi >= 24)
    {
        cout << bmi << endl;
        cout << "Overweight" << endl;
    }
    else
    {
        cout << "Normal" << endl;
    }
    return 0;
}