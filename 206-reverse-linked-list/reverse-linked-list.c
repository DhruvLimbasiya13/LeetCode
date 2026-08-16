/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {
    if(head == NULL){
        return head;
    }
    else{
        struct ListNode *save = head;
        struct ListNode *pred = NULL;
        struct ListNode *next = NULL;

        while (save != NULL)
        {
            next = save->next;
            save->next = pred;
            pred = save;
            save = next;
        }
        head = pred;

        return head ;
    }
}