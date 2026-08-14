/* class Node {
    int data;
    Node next;
    Node prev;

    Node(int d) {
        data = d;
        next = null;
        prev = null;
    }
} */

class Solution {
    public Node createDLL(int arr[]) {
        if (arr == null || arr.length == 0) return null;

        // 1. Head initialize karo pehle element se
        Node head = new Node(arr[0]);
        Node curr = head; // 'curr' hamesha current tail ko point karega

        // 2. Remaining elements ke liye loop chalao
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);

            curr.next = newNode;  // purani tail ka next -> new node
            newNode.prev = curr;  // new node ka prev -> purani tail

            curr = newNode;       // tail ko update kar ke new node pe le jao
        }

        return head;
    }
}