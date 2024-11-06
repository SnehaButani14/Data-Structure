import java.util.Scanner;
public class DuplicateNo{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array:");
		int n=sc.nextInt();
		boolean flag = false;

		int a[]=new int[n];

		for(int i=0;i<n;i++){
			System.out.print("a["+i+"]:");
			a[i]=sc.nextInt();
		}
		int c=1;

		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]==a[j]){
					flag = true;
				}
			}
		}
		if (flag == true){
			System.out.println("contains duplicate");
		}
		else{
			System.out.println("not contains duplicate");
		}
		
	}
}