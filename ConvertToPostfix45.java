import java.util.*;

public class ConvertToPostfix45 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the infix Expression(please enter ')' at the end of expression):");
        String str = sc.nextLine();
        implement(str); 
    }

    public static int LPF(char i){
    		if(i=='+'||i=='-'){
    			return 1;
    		}else if(i=='*'||i=='/'){
    			return 3;
    		}else if(i=='^'){
    			return 6;
    		}else if(i>='A'&&i<='Z'||i>='a'&&i<='z'){
    			return 7;	
    		}else if(i=='('){
    			return 9;
    		}else if(i==')'){
    			return 0;
    		}else{
    			return -2;
    		}
    	}

    public static int SPF(char i){
    		if(i=='+'||i=='-'){
    			return 2;
    		}else if(i=='*'||i=='/'){
    			return 4;
    		}else if(i=='^'){
    			return 5;
    		}else if(i>='A'&&i<='Z'||i>='a'&&i<='z'){
    			return 8;
    		}else if(i=='('){
    			return 0;
    		}else{
    			return -2;
    		}
    	}

    public static int RF(char i){
    	  	if(i=='+'||i=='-'||i=='*'||i=='/'||i=='^'){
    			return -1;
    		}else if(i>='A'&&i<='Z'||i>='a'&&i<='z'){
    			return 1;
    		}else{
    			return -2;
    		}
    	}

    public static void implement(String str){
    	Stack<Character> s=new Stack<>();
    	int rank=0;
    	String polish=" ";
    	s.push('(');
    	//int top=1;

    	for(int i=0;i<str.length();i++ ){
    		char next=str.charAt(i);
    		
    
    			while(SPF(s.peek())>LPF(next)){
    			
                char temp=s.pop();
    				
    			polish=polish+temp;
    			rank=rank+RF(temp);

    			if(rank<1){
    				System.out.println("Invalid string");
    			}
    		}
    			if(SPF(s.peek())!=LPF(next)){
    				s.push(next);
    			}
                else{
    				s.pop();
    			}	
    }
    		if(rank!=1||!s.isEmpty()){
    			System.out.println("Invalid");
    		}
            else{
		    	System.out.println("Valid string");
			}
            System.out.println(polish);
        }
	}