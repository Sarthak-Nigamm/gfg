class myStack {
    int capacity;
    int top;
    int arr[];

    public myStack(int a) {
        capacity = a;
        arr = new int[capacity];
        top = -1; // -1 indicates stack is initially empty
    }

    public boolean isEmpty() {
        return top == -1; // O(1)
    }

    public boolean isFull() {
        return top == capacity - 1; // O(1)
    }

    public void push(int x) {
        if (!isFull()) {
            top++;
            arr[top] = x;
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int val = arr[top];
            top--;
            return val;
        }
        return -1; // Underflow case
    }

    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        }
        return -1; // Underflow case
    }
}