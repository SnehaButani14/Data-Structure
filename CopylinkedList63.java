public class CopylinkedList63 {
    class Node{
        int info;
        Node link;
    
        Node(int info){
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

    public Node begin = null;
    Node avail;
    void copy(){
        Node newNode = new Node(3);
        if(first == null){
            System.out.println("Linkes list is empty");
        }
        if(avail == null){
            System.out.println("Underflow");
        }
        else{
            newNode = avail;
            avail = avail.link;
            newNode.info = first.info;
            begin = newNode;
        }
        Node save = first;
        while(save.link != null){
            Node pred = newNode;
            save = save.link;
            if(avail == null){
                System.out.println("Underflow");
            }
            else{
                newNode = avail;
                avail = avail.link;
                newNode.info = save.info;
                pred.link = newNode;
                pred = newNode;
                save = save.link;
            }
        }
        newNode = null;
    }
        
        void display(){
            Node temp = first;
            while(temp!=null){
                System.out.println(temp.info);
                temp = temp.link;
            }
        }
    


    public static void main(String[] args) {
        CopylinkedList63 c1 = new CopylinkedList63();
        c1.insertAtFirst(5);
        c1.insertAtFirst(54);
        c1.insertAtFirst(53);
        c1.display();
        c1.copy();
    }
}

