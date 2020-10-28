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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode resList = new ListNode(0);
        ListNode preHead = resList;
        
        int carry = 0, sum = 0;
   
        while(l1 != null || l2 != null || carry != 0){
            int num1 = 0, num2 = 0;
            if(l1 != null){
                num1 = l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                 num2 = l2.val;
                l2 = l2.next;
            }
            sum = (num1 + num2 + carry) % 10;
            carry = (num1 + num2 + carry) / 10;          
            resList.next = new ListNode(sum); // 
            resList = resList.next;
        }               
        return preHead.next;
        
        // what I am confused is l1.val. We can access the value instead of the node.
        // Since we do not have a head, for the result list, we initialize a 0 as the head to track the result
        
        // 3, the sum of digit is the increment of val in l1 and l2, so we can use accumulate adding.
        //sum = carry; sum += l1.val; sum += l2.val;
        
        
        
    }
}