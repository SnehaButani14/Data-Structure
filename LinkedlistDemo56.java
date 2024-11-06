public class LinkedlistDemo56 {
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
   
    void insertAtLast(int info){
        Node newNode = new Node(info);
        if(first == null){
            first = newNode;
            return;
        }
        else{
            Node current = first;
            while(current.link!=null){
                current = current.link;
            }
            current.link =  newNode;
        }
    }

    void insertInOrder(int info){
        Node newNode = new Node(info);
        if(first == null || newNode.info < first.info){
            newNode = first;
            return;
        }
        else{
            Node current = first;
            while(current.link!=null && newNode.info > current.info){
                current = current.link;
            } 
                newNode.link = current.link;
                current.link = newNode;
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
       LinkedlistDemo56 list = new LinkedlistDemo56();
       list.insertAtFirst(5);
       list.insertAtFirst(4);
       list.insertAtFirst(3);
       list.insertAtFirst(2);
       list.insertAtFirst(1);
       list.insertAtLast(7);
       list.insertAtLast(8);
       list.insertAtFirst(0);
       list.insertInOrder(6);
       list.display();
    }
    
}