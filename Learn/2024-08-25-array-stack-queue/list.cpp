#include <vector>
#include <algorithm>

using namespace std;

// 需注意，C++ 中 vector 即是本文描述的 list
// 无初始值
vector<int> list1;
// 有初始值
vector<int> list = {1, 3, 2, 5, 4};

/* 初始化列表 */
void init()
{
    /* 访问元素 */
    int num = list[1]; // 访问索引 1 处的元素
    /* 更新元素 */
    list[1] = 0; // 将索引 1 处的元素更新为 0
}

void insert_and_delete()
{
    /* 清空列表 */
    list.clear();
    /* 尾部添加元素 */
    list.push_back(1);
    list.push_back(3);
    list.push_back(2);
    list.push_back(5);
    list.push_back(4);
    /* 中间插入元素 */
    list.insert(list.begin() + 3, 6); // 在索引 3 处插入数字 6
    /* 删除元素 */
    list.erase(list.begin() + 3); // 删除索引 3 处的元素
}

void traverse()
{
    /* 通过索引遍历列表 */
    int count = 0;
    for (int i = 0; i < list.size(); i++)
    {
        count++;
    }
    /* 直接遍历列表元素 */
    count = 0;
    for (int n : list)
    {
        count++;
    }
}

void combine()
{
    /* 拼接两个列表 */
    vector<int> list1 = {6, 8, 7, 10, 9};
    // 将列表 list1 拼接到 list 之后
    list.insert(list.end(), list1.begin(), list1.end());
}

void sort_list()
{
    /* 排序列表 */
    sort(list.begin(), list.end()); // 排序后，列表元素从小到大排列
}