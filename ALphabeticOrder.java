import java.util.Scanner;

public class ALphabeticOrder{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array:");
		int n=sc.nextInt();

		System.out.println("Enter some names:");

		String a[] = new String[n];
		for(int i=0;i<n;i++){
			System.out.print("a["+i+"] :");
			a[i]=sc.nextLine();
		}

		for(int i=0;i<n;i++){
			System.out.print("a["+i+"] :"+a[i]);
		}
	}
}