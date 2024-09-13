#include <iostream>

using namespace std;

char **get_mem(char **ch, int n)
{
    ch = new char *[n];
    for (int i = 0; i < n; i++)
    {
        ch[i] = new char[n];
    }
    return ch;
}

void input_data(char **ch, int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cin >> ch[i][j];
        }
    }
}

char **transfer1(char **ch, int n)
{
    char **temp = get_mem(temp, n);

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            temp[i][j] = ch[n - j - 1][i];
        }
    }
    return temp;
}

char **transfer2(char **ch, int n)
{
    char **temp = get_mem(temp, n);

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            temp[i][j] = ch[n - i - 1][n - j - 1];
        }
    }
    return temp;
}

char **transfer3(char **ch, int n)
{
    char **temp = get_mem(temp, n);

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            temp[i][j] = ch[j][n - i - 1];
        }
    }
    return temp;
}

char **transfer4(char **ch, int n)
{
    char **temp = get_mem(temp, n);

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            temp[i][j] = ch[i][n - j - 1];
        }
    }
    return temp;
}

bool check_same(char **ch1, char **ch2, int n)
{

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            if (ch1[i][j] != ch2[i][j])
            {
                return false;
            }
        }
    }

    return true;
}
void display(char **ch, int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cout << ch[i][j];
        }
        cout << endl;
    }
}

int main(void)
{

    int n;
    cin >> n;
    char **char_origion = get_mem(char_origion, n);
    char **char_trasfer = get_mem(char_trasfer, n);

    input_data(char_origion, n);
    input_data(char_trasfer, n);

    char **temp;
    bool is_same;

    // temp = transfer4(char_origion, n);
    // display(temp, n);

    temp = transfer1(char_origion, n);
    is_same = check_same(char_trasfer, temp, n);
    if (is_same)
    {
        cout << 1 << endl;
        return 0;
    }

    temp = transfer2(char_origion, n);
    is_same = check_same(char_trasfer, temp, n);
    if (is_same)
    {
        cout << 2 << endl;
        return 0;
    }

    temp = transfer3(char_origion, n);
    is_same = check_same(char_trasfer, temp, n);
    if (is_same)
    {
        cout << 3 << endl;
        return 0;
    }

    temp = transfer4(char_origion, n);
    is_same = check_same(char_trasfer, temp, n);
    if (is_same)
    {
        cout << 4 << endl;
        return 0;
    }

    char **temp2;
    temp2 = transfer1(temp, n);
    is_same = check_same(char_trasfer, temp2, n);
    if (is_same)
    {
        cout << 5 << endl;
        return 0;
    }

    temp2 = transfer2(temp, n);
    is_same = check_same(char_trasfer, temp2, n);
    if (is_same)
    {
        cout << 5 << endl;
        return 0;
    }

    temp2 = transfer3(temp, n);
    is_same = check_same(char_trasfer, temp2, n);
    if (is_same)
    {
        cout << 5 << endl;
        return 0;
    }

    is_same = check_same(char_origion, char_trasfer, n);
    if (is_same)
    {
        cout << 6 << endl;
        return 0;
    }

    cout << 7 << endl;

    return 0;
}