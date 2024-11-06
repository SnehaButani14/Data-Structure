import java.util.Scanner;
public class FactUsingRecursion {

   
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt(); 
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is " + result);
    }
}
 
    

