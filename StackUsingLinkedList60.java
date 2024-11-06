class Node {
    int info;
    Node link;

    public Node(int info) {
        this.info = info;
        this.link = null;
    }
}

public class StackUsingLinkedList60 {
    Node first = null;

    public boolean isEmpty() {
        return first == null;
    }

    public void push(int x) {
        Node newNode = new Node(x); 
        newNode.link = first;
        first = newNode;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0; 
        } else {
            int poppedData = first.info;
            first = first.link;
            return poppedData;
        }
    }

    // Display the stack elements
    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            Node current = first;


            
            while (current != null) {
                System.out.println(current.info);
                current = current.link;
            }
        }
    }

    public static void main(String[] args) {
        StackUsingLinkedList60 obj = new StackUsingLinkedList60();
        obj.push(50);
        obj.push(25);
        obj.push(30);
        obj.push(35);
        obj.push(55);
        obj.push(95);
        obj.pop();
        obj.display();
    }
}
