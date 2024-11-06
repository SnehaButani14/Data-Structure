import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum+=i*(i+1)/2;
        }
        System.out.print("Sum : "+sum);
    }
}
