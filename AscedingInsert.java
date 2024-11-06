import java.util.*;
public class AscedingInsert{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        System.err.println("Enter array element in ascending order : ");
        int[] arr = new int[size];
        int[] ans = new int[size+1];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("enter element for insert : ");
        int e=sc.nextInt();
        int i=0;
		while(arr[i]<e){
			ans[i]=arr[i];
			i++;
		}
		ans[i]=e;
		i++;
		while(i<size+1){
			ans[i]=arr[i-1];
			i++;
		}
		for(int j=0;j<size+1;j++){
			System.out.println("ans["+j+"]:"+ans[j]);
		}
	}
}