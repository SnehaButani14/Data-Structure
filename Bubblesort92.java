import java.util.Arrays;
import java.util.Scanner;

public class Bubblesort92 {
    void swap(int arr[] , int x , int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    void bubblesort(int arr[] , int n){
        int last = n-1;
        int flag;
        for(int i=0;i<n-1;i++){
            flag=0;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr , j  ,j+1);
                    flag=flag+1;
                }  
            }
            if(flag==0){
                break;
            }
        }
        System.out.println("Sorted array is" + Arrays.toString(arr));
    }
    void printArray(int arr[]) {
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Bubblesort92 b1 = new Bubblesort92();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter elements of array");
        for(int i =0 ;i <size;i++)
        {
        array[i] = sc.nextInt();
        }
        b1.bubblesort(array,size);
        b1.printArray(array);
    }
}
