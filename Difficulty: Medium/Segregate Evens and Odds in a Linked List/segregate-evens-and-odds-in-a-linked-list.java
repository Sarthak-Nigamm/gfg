/* Structure of a Linked List Node
class Node {
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}*/

class Solution {
    Node divide(Node head) {
        Node even = new Node(-1);
        Node evenHead = even;
        Node odd = new Node(-1);
        Node oddhead = odd;
        // code here
        Node temp = head;
        while(temp!=null){
            if(((temp.data)%2)==0){
                even.next = temp;
                even =even.next;
            }else{
                odd.next = temp;
                odd=odd.next;
            }
            temp =temp.next;
        }
        even.next = oddhead.next;
        odd.next = null;
    return evenHead.next;}
}