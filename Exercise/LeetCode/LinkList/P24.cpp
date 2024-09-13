#include <iostream>

using namespace std;

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
struct ListNode
{
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

class Solution
{
public:
    ListNode *swapPairs(ListNode *head)
    {
        // 创建一个虚拟头节点，方便处理头两个节点
        ListNode dummy(0);
        dummy.next = head;
        ListNode *prev = &dummy;

        while (head && head->next)
        {
            ListNode *first = head;
            ListNode *second = head->next;

            // 交换相邻节点
            prev->next = second;
            first->next = second->next;
            second->next = first;

            // 更新 prev 和 head
            prev = first;
            head = first->next;
        }

        return dummy.next;
    }
};

int main(void)
{

    return 0;
}