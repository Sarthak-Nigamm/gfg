/* Structure of Linked List Node
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        if(x==1){
            return head.next;
        }
        Node temp = head;
        if(head==null){
            return head;
        }
        Node prev = null;
        while(x>1){
            prev = temp;
            temp = temp.next;
           x--;
        }
        prev.next = temp.next;
  return head;  }
}