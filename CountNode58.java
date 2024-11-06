public class CountNode58 {

    class Node{
        int info;
        Node link;
        public Node(int info){
            this.info = info;
            this.link = null;
        }
    }
    public Node first = null;
    void insertAtFirst(int info){
        Node newNode = new Node(info);

        if(first == null){
            first = newNode;
            return;
        }
        Node temp = first;
        first = newNode;
        first.link = temp;
    }
    void countNode(){      
        int count=0;
        if(first == null){
            count = 0;
        }
        else{
            Node current = first;
            while(current!=null){
                System.out.println("Hello");
                count++;
                current=current.link;
            }
        }
        System.out.println("No of nodes:" + count);
    }
    public static void main(String[] args) {
        CountNode58 d1 = new CountNode58();
        d1.insertAtFirst(5);
        d1.insertAtFirst(4);
        d1.insertAtFirst(3);
        d1.insertAtFirst(2);
        d1.insertAtFirst(1);
        d1.countNode();
    }
}
