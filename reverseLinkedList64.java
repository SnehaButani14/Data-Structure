public class reverseLinkedList64 {
    class Node{
        int info;
        Node link;
        Node(int data){
            this.info = data;
            this.link = null;
        }
    }
    public Node first = null;

    public void append(int data) {
        if (first == null) {
            first = new Node(data);
            return;
        }
        Node current = first;
        while (current.link != null) {
            current = current.link;
        }
        current.link = new Node(data);
    }

    void reverse(){
        Node newNode = new Node(5);
        if(first == null){
            System.out.println("Linked list is empty");
        }
        else{
            Node save = first;
            Node pred = null;
            Node next = null;
            while(save!=null){
                next = save.link;
                save.link = pred;
                pred = save;
                save = next;
            }
            first = pred;
        }
    }

    void display(){
        Node temp = first;
        while(temp!=null){
            System.out.println(temp.info);
            temp = temp.link;
        }
    }

    public static void main(String[] args) {
        reverseLinkedList64 r1 = new reverseLinkedList64();
        r1.append(5);
        r1.append(6);
        r1.append(7);
        System.out.println("Original list:");
        r1.display();
        r1.reverse();
        System.out.println("Reverse list:");
        r1.display();
    }
}

