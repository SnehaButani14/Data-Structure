
public class doubleEndedQueue50 {
    int[] queue;
    int f=-1;
    int r=-1;
    int n;
    doubleEndedQueue50(int size){
        this.n = size;
        this.queue = new int[n];
    }
    void dqInsert_rear(int y){
        if(r==n){
            System.out.println("Queue overflow");
        }
        else{
            if(r==-1){
                r=f=0;
            }
            else{
                r++;
            }
            queue[r] = y;
        }
    }
    int dqDelete_front(){
        int y;
        if(f==-1){
            System.out.println("Queue underflow");
            return -1;
        }
        else{
            if(f==r){
                f=r=0;
            }
            else{
                f++;
            }
            y=queue[f];
        }
        return y;
    }
    void dqInsert_front(int y){
        if(f==0){
            System.out.println("Queue overflow");
        }
        else{
            if(f==-1){
                f=r=0;
            }
            else{
                f++;
            }
            queue[f] = y;
        }
    }
    int dqDelete_rear(){
        return 0;
    }
    void display(){
        for(int i=f;i<=r;i++){
            System.out.println(queue[i]);
        }
    }
    public static void main(String[] args) {
        doubleEndedQueue50 d1 = new doubleEndedQueue50(5);
        d1.dqInsert_rear(1);
        d1.dqInsert_rear(2);
        d1.dqInsert_rear(3);
        d1.dqInsert_rear(4);
        d1.dqInsert_rear(5);
        d1.display();
        d1.dqDelete_front();
        System.out.println("After delete:");
        d1.display();
        d1.dqInsert_front(6);
        System.out.println("After insert at front:");
        d1.display();


    }
}
