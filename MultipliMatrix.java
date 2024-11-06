import java.util.Scanner;

public class MultipliMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row of matrix1: ");
        int r1 = sc.nextInt();
         System.out.print("Enter column of matrix1: ");
        int c1 = sc.nextInt();
         System.out.print("Enter column of matrix2: ");
        int c2 = sc.nextInt();
        int r2 = c1;
        int[][] a = new int[r1][c1];
        int[][] b = new int[r2][c2];
        int[][] c = new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print("Enter value of a["+i+"]["+j+"]");
                a[i][j] = sc.nextInt();
            }
         }
         for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                System.out.print("Enter value of b["+i+"]["+j+"]");
                b[i][j] = sc.nextInt();
            }
         }
         for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                c[i][j] = 0;
                for (int k = 0; k < r2; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
