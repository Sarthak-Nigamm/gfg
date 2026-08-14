/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        // code here
        Node newNode = new Node(x);
        Node temp = head;
        Node tail = null;
      if(head==null){
          return newNode;
      }  
     while(temp.next!=null){
         temp = temp.next;
     }
        tail = temp;
        tail.next = newNode;
  return head;  }
}