import java.util.Scanner;
public class ArmstrongNo12{

	public static void main(String[] args) {
		int r;
		int sum=0;
		int n;
		for(int i=1;i<=1000;i++){
			n=i;
			while(n>0){
				r=n%10;
				sum=sum+(r*r*r);
				n=n/10;
			}
				if(sum==i){
					System.out.println(i+" ");
				}
				sum=0;
			}
		}
    }