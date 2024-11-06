import java.util.*;

public class Evaluatepostfix47 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the infix Expression :");
        String str = sc.nextLine();
        implement(str); 
    }

    public static void implement(String str){
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < str.length(); i++){

            char temp = str.charAt(i);

            if(Character.isDigit(temp)){
                s.push(Integer.parseInt(String.valueOf(temp)));
            } 
            else {
                int op2 = s.pop();
                int op1 = s.pop();

                switch(temp){
                    case '+': 
                            s.push(op1 + op2); 
                            break;
                    case '-': 
                            s.push(op1 - op2); 
                            break;
                    case '*': 
                        s.push(op1 * op2); 
                        break;
                    case '/': 
                        s.push(op1 / op2); 
                        break;
                    default: 
                        System.out.println("Invalid operator: " + temp); 
                        return;
                }
            }
        }
        
        System.out.println("Evaluated string:");
        System.out.println(s.pop());
    }
}   






















