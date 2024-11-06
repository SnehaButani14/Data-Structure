public class CircularQueue51 {
    int[] queue;
    int f=-1;
    int r=-1;
    int n;
    CircularQueue51(int size){
        this.n = size;
        this.queue = new int[n];
    }
    void cq_insert(int y){
        if(r==n){
            r=0;
        }
        else{
            r++;
        }
        if(f==r){
            System.out.println("Overflow");
        }
        queue[r] = y;
        if(f==-1){
            f=0;
        }
    }
    int cq_delete(){
        if(f==-1) {
            System.out.println("Underflow");
            return 0;
        }
        int y=queue[f];
        if(f==r){
            f=r=-1;
        }
        if(f==n){
            f=-1;
        }
        else{
            f++;
        }
        return y;
    }
    void display(){
        if(r==-1){
            System.out.println("Queue is empty");
        }
        else{
        for(int i=f;i<=r;i++){
            System.out.println(queue[i]);
            }
        }
    }
    public static void main(String[] args) {
    CircularQueue51 c1 = new CircularQueue51(5);
    c1.cq_insert(1);
    c1.cq_insert(2);
    c1.cq_insert(3);
    c1.cq_insert(4);
    c1.cq_insert(5);
    c1.display();
    c1.cq_delete();
    System.out.println("After delete:");
    c1.display();
    }
}
