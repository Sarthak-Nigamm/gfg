import java.util.*;
class myStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    void push(int x) {
        // Inserts an element x at the top of the stack
        q2.add(x);

        // Step 2: q1 ke saare elements q2 mein shift kar do
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        // Step 3: q1 aur q2 ko swap kar do
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    int pop() {
        // Removes an element from the top of the stack
        if(q1.isEmpty()) return -1;
        return q1.remove(); 
    }

    int top() {
        // Returns the top element of the stack
        // If stack is empty, return -1
        if(q1.isEmpty()) return -1;
        return q1.peek(); 
    }

    int size() {
        // Returns the current size of the stack
        return q1.size();
    }
}