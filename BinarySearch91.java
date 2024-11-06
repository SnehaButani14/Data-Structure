import java.util.Scanner;

public class BinarySearch91 {
    void binarySearch(int[] arr , int key){
        int l = 0;
        int r = arr.length - 1;
        int middle = 0;
        boolean flag = false;
        
        while(l <= r){
            middle = (l + r) / 2;
            if(arr[middle] == key){
                flag = true;
                break;
            } else if(arr[middle] <= key){
                l = middle + 1;
            } else {
                r = middle - 1;
            }
        }
        
        if(flag){
            System.out.println("Element found at index: " + middle);
        } else {
            System.out.println("Element not found");
        }
    }
    
    public static void main(String[] args) {
        BinarySearch91 b1 = new BinarySearch91();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enetr elements of array:");
        for(int i =0 ; i< size ; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enetr element for search:");
        int key = sc.nextInt();
        b1.binarySearch(array , key); 
    }
}
