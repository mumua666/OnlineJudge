#include <iostream>
#include <sstream>
#include <vector>
#include <string>
#include <map>

using namespace std;

vector<string> split(const string &s, char delimiter)
{
    vector<string> tokens;        // 用来存储子字符串的向量
    string token;                 // 存储从istringstream中读取的每个子字符串
    istringstream tokenStream(s); // 将string转换为istringstream，方便按照分隔符读取子字符串

    // 当还能从tokenStream中读取到数据时，循环继续
    while (getline(tokenStream, token, delimiter))
    {
        tokens.push_back(token); // 将读取到的子字符串添加到向量中
    }

    return tokens; // 返回包含所有子字符串的向量
}

map<string, string> splitAssign(const string &s, char delimiter)
{
    vector<string> tokens = split(s, delimiter);
    map<string, string> tokenMap;
    string key = tokens[0].substr(0, 1);
    string value = tokens[1];
    tokenMap[key] = value;
    return tokenMap;
}

int main()
{
    string s;
    getline(cin, s);
    char delimiter = ';'; // 指定的分隔符

    vector<string> tokens = split(s, delimiter); // 调用函数进行拆分

    vector<map<string, int>> var;

    for (const auto &token : tokens)
    {
        // cout << token << endl; // 打印结果
        map<string, string> tokenMap;
        tokenMap = splitAssign(token, '=');
        for (const auto &pair : tokenMap)
        {
            cout << pair.first << "->" << pair.second << endl;
        }
    }

    return 0;
}
