/*
// Representation of a node
class Node {
    int data;
    Node next;
    Node (int d) {
       data = d;
       next = null;
    }
};
*/
class Solution {
    public Node arrayToList(int arr[]) {
        // code here
        Node head = null;
        Node tail = null;
        for(int i =0; i<arr.length; i++){
        Node newNode = new Node(arr[i]);
            if(head == null){
                head = tail = newNode;
            }else{
                tail.next = newNode;
                tail = tail.next;
            }
        }
  return head;  }
}
