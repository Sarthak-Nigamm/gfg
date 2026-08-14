/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        // code here
       //find mid
        Node fast = head.next;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            fast =fast.next.next;
            slow = slow.next;
        }
        Node mid =slow;
       //reverse right
       Node curr = mid.next;
       Node prev = null;
       Node next;
       while(curr!=null){
           next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;
       }
       //check for both
       Node left = head;
       Node right = prev;
       while(left!=null && right!=null){
         if(left.data!=right.data){
             return false;
         }
         left = left.next;
         right = right.next;
       }
       
   return true; }
}