class StackDemo{
    int[] stack;
    int top = -1;
    int size=0;
    int i;
    int index;
    StackDemo(int size){
        stack = new int[size];
        this.size = size;
    }
    void push(int x){
        if(top>=size-1){
            System.out.println("Stack overflow");
        }
        else{
            top=top+1;
            stack[top] = x;
        }
    }
    int pop(){
        if(top==0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            top = top-1;
            return stack[top-1];
        }
    }
    int peep(int i){
        if(top-i+1<=0){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            return stack[top-i+1];
        }
    }
    int change(int i,int x){
        if(top-i+1<=0){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            
            stack[top-i+1]=x;
            return stack[top-i+1];  
        }
    }
    void display(){
        if(top>=0){
        for(int i=0;i<size-1;i++){
            System.out.println(stack[i]);
        }
    }
    else{
        System.out.println("Empty");
    }
    }
}

public class StackMain38 {

    public static void main(String[] args) {
        StackDemo obj = new StackDemo(10);
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