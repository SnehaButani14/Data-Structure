import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array:");
        int a1 = sc.nextInt();
        int[] a = new int[a1];
        System.out.println("Enter size of Second array:");
        int b1 = sc.nextInt();
        int[] b = new int[b1];
        
        int c1 = a1 + b1;
        int[] c = new int[c1];

        for (int i=0;i<a1;i=i+1){
        System.out.println("Enter first array elements : ");

           a[i] = sc.nextInt();
        }
        for (int i=0;i<b1;i=i+1){
        System.out.println("Enter Second array elements : ");

            b[i] = sc.nextInt();
         }
        for (int i=0;i<a1;i=i+1){
            c[i] = a[i];
        }

        for (int i=0;i<b1;i=i+1) {
            c[a1 + i] = b[i];
        }
        System.out.println("Merged array: ");
        for (int i=0;i<c1;i++) {
            System.out.print(c[i] + " ");
        }
    }
}