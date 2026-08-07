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
    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a,b) ->
        a.val - b.val);

        for(ListNode list: lists){
            minHeap.offer(list);
        }

        ListNode res = new ListNode(0);
        ListNode cur = res;

        while(!minHeap.isEmpty()){

            ListNode temp = minHeap.poll();

            cur.next = temp;
            cur = cur.next;

            temp = temp.next;

            if(temp != null){
                minHeap.offer(temp);
            }
        }

    return res.next;

    }
}
