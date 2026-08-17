class myQueue {

    // Initialize your data members
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    void enqueue(int x) {
        // Implement enqueue operation
        s1.push(x);
    }

    int dequeue() {
        // Implement dequeue operation
        shiftStack();
        if(s2.isEmpty()) return -1;
        return s2.pop();
    }

    int front() {
        // Implement front operation
        shiftStack();
        if(s2.isEmpty()) return -1;
        return s2.peek();
    }

    int size() {
        // Implement size operation
        return s1.size()+s2.size();
    }
    public void shiftStack(){
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
    }
}
