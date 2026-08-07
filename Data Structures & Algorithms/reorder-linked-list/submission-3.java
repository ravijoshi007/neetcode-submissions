/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

       ListNode second = slow.next;
       ListNode pre = slow.next = null;

       while(second != null){

        ListNode temp = second.next;
        second.next = pre;
        pre = second;
        second = temp;
       }

       ListNode first = head;
       second = pre;

       while(second != null){
        ListNode tmp = first.next;
        ListNode tmp1 = second.next;

        first.next = second;
        second.next = tmp;

        first = tmp;
        second = tmp1;
       }
        
    }
}
