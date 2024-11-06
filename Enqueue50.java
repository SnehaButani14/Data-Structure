import java.util.Scanner;

public class Enqueue50 {
    int[] queue;
    int n;
    int r = -1;
    int f = -1;

    Enqueue50(int size){
        this.n = size;
        this.queue = new int[n];
    }

    void enqueue(int y){
        if(r>=n-1){
            System.out.println("Queue overflow");
        }
        else{
            r++;
        }
        queue[r] = y;
        if(f==-1){
            f=0;
        }
    }

    int dequeue(){
        if(r==-1){
            System.out.println("Queue underflow");
            return -1;
        }
        int y = queue[f];
        if(f==r){
            f=r=-1;
        }
        else{
            f=f+1;
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
        Enqueue50 q1 = new Enqueue50(5); 
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(4);
        q1.enqueue(5);
        q1.dequeue();
        q1.dequeue();
        q1.display();
    }
}
