import java.util.Scanner;
public class Insertno {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        int[] ans = new int[size+1];
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        System.out.print("Enter Index : ");
        int index = sc.nextInt();
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        for(int i=0;i<index;i++){
            System.out.println("Enter array element : ");
           ans[i]=array[i];
        }
        ans[index]=num;
        for(int i=index+1;i<size+1;i++){
            ans[i]=array[i-1];
        }
        for(int i=0;i<size+1;i++){
            System.out.println(ans[i]);
        }
        
     }
}
