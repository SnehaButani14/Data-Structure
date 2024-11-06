public class DeleteNode57 {
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

   void deleteFromFirst(int X){

      Node newNode = new Node(5);

      Node current = first;
      Node preds = first;

      if(first==null){
         System.out.println("underflow");
      }
      else{
        
         while(current.info!=X&&current.link!=null){
            preds = current;
            current=current.link;
         }
      }
   
      if(current.info!=X){
         System.out.println("Node not found");
      }
      if(X==first.info){
      first=first.link;
      }
      else{
         preds.link = current.link;
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
      DeleteNode57 d1 = new DeleteNode57();
      d1.insertAtFirst(5);
      d1.insertAtFirst(4);
      d1.insertAtFirst(3);
      d1.insertAtFirst(2);
      d1.insertAtFirst(1);
      d1.deleteFromFirst(3);
      d1.display();
   }
}
