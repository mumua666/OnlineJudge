#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

// 将一个整数转换为对应的数字数组
vector<int> toDigits(int n)
{
    vector<int> digits;
    while (n > 0)
    {
        digits.push_back(n % 10);
        n /= 10;
    }
    reverse(digits.begin(), digits.end());
    return digits;
}

// 检查三个数的比例是否为 A:B:C，并且所有的数字都在 1-9 之间且不重复
bool isValid(int a, int b, int c, int A, int B, int C)
{
    vector<int> digits;
    vector<int> da = toDigits(a);
    vector<int> db = toDigits(b);
    vector<int> dc = toDigits(c);

    digits.insert(digits.end(), da.begin(), da.end());
    digits.insert(digits.end(), db.begin(), db.end());
    digits.insert(digits.end(), dc.begin(), dc.end());

    // 检查所有数字是否都在 1-9 之间并且没有重复
    sort(digits.begin(), digits.end());
    if (digits.size() != 9 || digits[0] == 0)
        return false;

    for (int i = 0; i < 8; i++)
    {
        if (digits[i] == digits[i + 1])
            return false;
    }

    return (a * B == b * A) && (a * C == c * A);
}

int main()
{
    int A, B, C;
    cin >> A >> B >> C;

    vector<vector<int>> results;

    for (int a = 123; a <= 987; a++)
    {
        int b = a * B / A;
        int c = a * C / A;
        if (b > 999 || c > 999)
            continue;
        if (isValid(a, b, c, A, B, C))
        {
            results.push_back({a, b, c});
        }
    }

    if (results.empty())
    {
        cout << "No!!!" << endl;
    }
    else
    {
        sort(results.begin(), results.end());
        for (const auto &r : results)
        {
            cout << r[0] << " " << r[1] << " " << r[2] << endl;
        }
    }

    return 0;
}
