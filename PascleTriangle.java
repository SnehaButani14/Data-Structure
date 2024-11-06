import java.util.*;
class Try{
	public int factorial(int i){
		if(i==0){
			return 1;
		}
		else{
			return i*factorial(i-1);
		}
	}
}
public class PascleTriangle{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lines of triangle:");
		int n=sc.nextInt();

		Try a=new Try();

		for(int i=0;i<n;i++){
			for(int j=0;j<n-i;j++){
				System.out.println(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.println(" "+a.factorial(i)/(a.factorial(i-j)*a.factorial(j)));
			}
			System.out.println();
		}
	}
}