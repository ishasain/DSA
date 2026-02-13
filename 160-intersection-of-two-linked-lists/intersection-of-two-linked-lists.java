/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null;
        }
        ListNode p=headA;
        ListNode q=headB;

        // if(headA!=null && headB!=null){
        //     p=headA.next;
        //     q=headB.next;
        //     if(p==q){
        //         return p ;
        //     }

        // }
        // return null;
        while(p!=q){
            if(p==null){
                p =headB;}
             else{
                 p=p.next;
             }   

             if(q==null){
                q=headA;
             }
             else{
                q=q.next;
             }
            
        }
        return p;
    
        
    }
}