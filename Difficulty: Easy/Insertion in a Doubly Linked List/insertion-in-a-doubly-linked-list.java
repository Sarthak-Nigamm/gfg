/* Structure of Doubly Linked List Node
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node insertAtPos(Node head, int p, int x) {
        // code here
        Node curr = head;
        Node next;
        while(p>0){
            next = curr.next;
            curr = next;
            p--;
        }
        Node newNode = new Node(x);
        next = curr.next;
        curr.next = newNode;
        newNode.prev = curr;
        newNode.next = next;
        if(next !=null){
        next.prev = newNode;}
   return head; }
}