import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort93 {
    void insertionSort(int arr[] ,int n){
        int i = 1;
        while(i < n){
            int key = arr[i];
            int j = i-1;
            while(j>0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
            i++;
        }
        }
        void printArray(int arr[]) {
            System.out.println("Sorted array");
            System.out.println(Arrays.toString(arr));
        }
        public static void main(String[] args) {
            InsertionSort93 i1 = new InsertionSort93();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter size pf array:");
            int size = sc.nextInt();
            int array[] = new int[size];
            System.out.println("Enter elements of array");
            for(int i = 0 ;i<size ; i++){
                array[i] = sc.nextInt();
            }
            i1.insertionSort(array, size);
            i1.printArray(array);
        }
}

