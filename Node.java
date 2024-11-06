public class Node{
    int info;
    Node link;
    public Node(int data){
        this.info = data;
        this.link = null;
    }
}
Node first = null;
Node last = first;
int count=0;
public void countNode(){
    while(last.link!=null){
        count++;
        last = last.link;
    }
    System.out.println(count);
}