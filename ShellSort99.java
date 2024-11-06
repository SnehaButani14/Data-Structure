import java.util.Arrays;
import java.util.Scanner;

public class ShellSort99 {

    void swap(int arr[] , int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    void shellsort(int arr[] , int n){
        int gap;
        for(gap=n/2;gap>=1;gap=gap/2){
            for(int j=gap;j<n;j++){
                for(int i=j-gap;i>=0;i=i-gap){
                    if(arr[i+gap] > arr[i]){
                        break;
                    }
                    else{
                        swap(arr , i+gap , i);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        ShellSort99 s1 = new ShellSort99();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        System.out.println("Enter array elements:");
        int array[] = new int[size];
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        s1.shellsort(array,size);
        System.out.println(Arrays.toString(array));
    }
}
