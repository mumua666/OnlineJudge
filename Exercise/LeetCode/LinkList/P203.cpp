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
    ListNode *removeElements(ListNode *head, int val)
    {
        // 如果链表为空则直接返回空链表
        if (!head)
        {
            return head;
        }
        else
        {
            // 如果链表头的值为val则移动头结点到节点值不为val的节点，并删除前面的链表节点
            while (head->val == val)
            {
                ListNode *temp = head;
                head = head->next;
                delete temp;
                // 如果传入的列表节点值全为要删除的val，则直接返空链表
                if (head == nullptr)
                {
                    return head;
                }
            }
            ListNode *curNode = head;
            ListNode *nextNode = head ? head->next : nullptr;
            while (nextNode)
            {
                // 如果当前节点的下一个节点值为val，则删除下一个节点，不移动当前节点
                if (nextNode->val == val)
                {
                    curNode->next = nextNode->next ? nextNode->next : nullptr;
                    delete nextNode;
                    nextNode = curNode->next;
                }
                // 如果当前节点的下一个节点值不为val，则直接移动当前节点和当前节点的下一个节点
                else
                {
                    curNode = nextNode;
                    nextNode = curNode ? curNode->next ? curNode->next : nullptr : nullptr;
                }
            }
        }
        return head;
    }
};
int main(void)
{

    return 0;
}