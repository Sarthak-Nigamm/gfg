/* Structure of a Doubly Linked List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node delPos(Node head, int x) {
        // code here
        if(x==1){
            head = head.next;
            head.prev = null;
            return head;
        }
        
        Node curr = head;
        while(x>1 && curr.next!=null){
            curr = curr.next;
            x--;
        }
        curr.prev.next = curr.next;
        if (curr.next != null) {
            curr.next.prev = curr.prev;
        }
  return head;  }
}