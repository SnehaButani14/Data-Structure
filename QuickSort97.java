import java.util.Arrays;
import java.util.Scanner;

public class QuickSort97 {
    void swap(int array[], int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    void Quicksorting(int array[], int lb, int ub) {
        if (lb < ub) {
            int i = lb;
            int j = ub + 1;
            int key = array[lb];
            while (true) {
                i++;
                while (i < array.length && array[i] < key) {
                    i++;
                }
                j--;
                while (j >= 0 && array[j] > key) {
                    j--;
                }
                if (i < j) {
                    swap(array, i, j);
                } else {
                    break;
                }
            }
            swap(array, lb, j);
            Quicksorting(array, lb, j - 1);
            Quicksorting(array, j + 1, ub);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuickSort97 qs = new QuickSort97();

        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter an element:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        qs.Quicksorting(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}