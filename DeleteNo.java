import java.util.Scanner;

public class deleteno1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        int[] ans = new int[size - 1]; 

        for (int i = 0; i < size; i++) {
            System.out.print("Enter array element: ");
            array[i] = sc.nextInt();
        }

        System.out.print("Enter index to delete: ");  
        int index = sc.nextInt();

        // Validate the index
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }

        for (int i = 0; i < index; i++) {
            ans[i] = array[i];
        }

        for (int i = index; i < size - 1; i++) {
            ans[i] = array[i + 1];
        }

        for (int i = 0; i < size - 1; i++) {
            System.out.println(ans[i]);
        }
    }
}
