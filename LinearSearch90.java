import java.util.Scanner;
public class LinearSearch90{
    Scanner sc = new Scanner(System.in);
    void linearsearch(int arr[]){
        boolean flag = false;
        System.out.print("Enter element for search:");
        int key = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("Element found at index" + i);
                flag = true;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinearSearch90 l1 = new LinearSearch90();
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt(); 
        }
        l1.linearsearch(array);
    }
}