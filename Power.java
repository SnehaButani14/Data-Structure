import java.util.Scanner;
public class Power{
    public static void main(String args[]){
        int result=1;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number");
        int n = sc.nextInt();
         System.out.print("Enter a power");
        int p = sc.nextInt();
        for(int i=1;i<=p;i++){
            result*=n;
        }
       System.out.print("power" +result);
         
    }
}