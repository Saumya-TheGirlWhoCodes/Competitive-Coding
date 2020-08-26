/*

You are given the pointer to the head node of a linked list and an integer to add to the list. 
Create a new node with the given integer. 
Insert this node at the tail of the linked list and return the head node of the linked list formed after inserting this new node. 
The given head pointer may be null, meaning that the initial list is empty.

Sample Input

5
141
302
164
530
474

Sample Output

141
302
164
530
474

Explanation

First the linked list is NULL. After inserting 141, the list is 141 -> NULL.
After inserting 302, the list is 141 -> 302 -> NULL.
After inserting 164, the list is 141 -> 302 -> 164 -> NULL.
After inserting 530, the list is 141 -> 302 -> 164 -> 530 -> NULL. After inserting 474, the list is 141 -> 302 -> 164 -> 530 -> 474 -> NULL, which is the final list.

*/

class Solution {
    public ListNode insertNodeAtTail(ListNode head, int data) {
        ListNode temp=head;
        if(temp==null)              // if there is no element in linked list
        {
            head = new ListNode(data);
            return head;
        }
        while(temp.next != null)
        {
            temp = temp.next;       // storing last element in temp
        }
        temp.next = new ListNode(data); // adding new element
        return head;
        }
}