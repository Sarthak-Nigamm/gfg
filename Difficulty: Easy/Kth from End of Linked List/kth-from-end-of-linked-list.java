/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int getKthFromLast(Node head, int k) {
        // code here
        Node temp = head;
        int count = 0;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        if((count - k +1) <1){
            return -1;
        }
        //total-last+1
        temp = head;
        int first = count-k+1;
        while(first!=1){
            temp =temp.next;
            first--;
        }
   return temp.data; }
}