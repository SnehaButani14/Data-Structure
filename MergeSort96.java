import java.util.Arrays;
import java.util.Scanner;

public class MergeSort96 {
    void mergeSort(int arr[], int low, int high) {
        if (low < high) {
            int mid = ((low + high) / 2);
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    void merge(int arr[], int low, int mid, int high) {
        int h = low;
        int i = low;
        int j = mid + 1;
        int[] b = new int[high];
        while (h <= mid && j <= high) {
            if (arr[h] <= arr[j]) {
                b[i] = arr[h];
                h++;
            } else {
                b[i] = arr[j];
                j++;
            }
            i++;
        }
        if (h > mid) {
            for (int k = j; k <=high; k++) {
                b[i] = arr[k];
                i++;
            }
        } else {
            for (int k = h; k <=mid; k++) {
                b[i] = arr[k];
                i++;
            }
        }
        for (int l = low; l <=high; l++) {
            arr[l] = b[l];


        }
    }

    public static void main(String[] args) {
        MergeSort96 obj = new MergeSort96();
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        obj.mergeSort(array, 0, size - 1);
        System.out.println(Arrays.toString(array));
    }
}
