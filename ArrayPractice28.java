import java.util.Scanner;

public class ArrayPractice28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  size of array");
        int size = sc.nextInt();
        System.out.println("Enter array elements");
        int[] arr = new int[size];
        int sum=0;
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++){
            sum += arr[i];
        }
        int max = 0;
        int min = 0;
        System.out.println("Sum=" + sum );
        for(int i=0;i<size;i++){
           if(arr[max] > arr[i]){
            arr[max] = arr[i];
           }
           else if(arr[min] < arr[i]){
            arr[min] = arr[i];
           }
        }
        System.out.println(arr[max]);
        System.out.println(arr[min]);
    }
}
