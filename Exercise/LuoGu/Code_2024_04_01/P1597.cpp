#include <iostream>
#include <sstream>
#include <string>
using namespace std;

int main()
{
    // 初始化变量a, b, c为0
    int a = 0, b = 0, c = 0;

    string line;
    // 获取整个输入作为一行字符串
    getline(cin, line);
    stringstream ss(line); // 使用stringstream解析输入

    string statement;
    // 遍历每个赋值语句
    while (getline(ss, statement, ';'))
    {
        // cout << statement << endl;

        if (statement.empty())
            continue;             // 跳过空语句
        char var1 = statement[0]; // 被赋值的变量
        char op1 = statement[1];  // 应该是':='中的':'
        char op2 = statement[2];  // 应该是':='中的'='
        char var2 = statement[3]; // 赋值使用的变量或数字

        // 确认格式正确
        if (op1 != ':' || op2 != '=')
        {
            cout << "Syntax error!" << endl;
            return 1; // 语法错误，终止程序
        }

        // 根据var2是数字还是变量进行赋值
        int value = (var2 >= '0' && var2 <= '9') ? var2 - '0' : (var2 == 'a' ? a : (var2 == 'b' ? b : c));

        // 更新变量值
        if (var1 == 'a')
        {
            a = value;
        }
        else if (var1 == 'b')
        {
            b = value;
        }
        else if (var1 == 'c')
        {
            c = value;
        }
    }

    // 输出最终的变量值
    cout << a << " "
         << b << " "
         << c << endl;

    return 0;
}
