import java.util.Arrays;
import java.util.Scanner;
public class SelectionSort94 {
    
    void swap(int arr[], int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    void selectionSort(int arr[]) {
        int n = arr.length;
        for(int i=0;i<=n-2;i++){
            int min_index = i;
            for(int j=i+1;j<=n-1;j++){
                if(arr[j]<arr[min_index]){
                    min_index = j;
                }
            }
            if(min_index != i){
                swap(arr,i,min_index);
            }
        }
        }
    void printArray(int arr[]) {
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(arr));
    }
   
        
    public static void main(String[] args) {
        SelectionSort94 ob = new SelectionSort94();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        System.out.println("Enter the elements of array");
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
        }
        ob.selectionSort(arr);
        ob.printArray(arr);
    }
}

