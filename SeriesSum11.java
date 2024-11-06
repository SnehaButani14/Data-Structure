import java.util.Scanner;
public class SeriesSum11 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        int total=0;
        for(int i=1;i<=n;i++){
            int ans = (i*(i+1))/2;
            total += ans;
        }
        System.out.println("ans=" + total);
    }
}
