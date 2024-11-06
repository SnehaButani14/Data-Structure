import java.util.Scanner;
public class AscedingDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enetr array element in ascending order : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int[] ans = new int[size-1];
        System.out.print("Eneter element for delete : ");
        int e = sc.nextInt();
        int i=0;
        while(arr[i]<e){
            ans[i] = arr[i];
            i++;
        }
        while(i<size-1){
            ans[i]=arr[i+1];
            i++;
        }
        for(int j=0;j<size-1;j++)
        {
            System.out.println("ans["+j+"]"+ans[j]);
        }
    }
}       
