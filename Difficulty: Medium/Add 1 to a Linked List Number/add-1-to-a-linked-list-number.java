class Solution {
    public Node addOne(Node head) {
        // Step 1: List ko reverse karo aur naya head save karo
        head = reverseList(head);

        // Step 2: 1 add karo
        Node curr = head;
        int carry = 1;     // Humein initially 1 add karna hai
        Node prev = null;  // Isko track karenge taaki naya node jorne me kaam aaye

        while (curr != null) {
            int sum = curr.data + carry;
            curr.data = sum % 10; // Node me last digit rakho (eg. 10 % 10 = 0)
            carry = sum / 10;     // Carry aage bhejo (eg. 10 / 10 = 1)

            prev = curr;          // Current node ko save kar lo
            curr = curr.next;

            // Optimization: Agar carry 0 ho gaya, toh aage ke nodes me add karne ki zarurat hi nahi
            if (carry == 0) {
                break;
            }
        }

        // Agar poori list traverse ho gayi par carry bach gaya (999 wala case)
        if (carry > 0) {
            prev.next = new Node(carry);
        }

        // Step 3: List ko wapas reverse kardo original form me laane ke liye
        head = reverseList(head);

        return head; 
    }

    // Helper function: List ko reverse karne ke liye
    private Node reverseList(Node head) {
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev; // Reverse hone ke baad 'prev' hi naya head hota hai
    }
}