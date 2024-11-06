import java.util.Scanner;
public class SmallLArge {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter array element : ");
            array[i] = sc.nextInt();
        }
        int max = 0;
        int min = 0;
        for(int i=0;i<size;i++){
          if(array[i]>array[max]){
            max = i;
          }
          if(array[i]<array[min]){
            min = i;
          }
        }
        System.out.print("Largest no position : "+max);
        System.out.print("Smallest no position : "+min);
    }
}
