/**Java program to find the order of a given number*/
import java.util.*;

public class Test{
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scan.nextInt();
		
		int d=countDigit(n);
		int p=power(n,d);
		System.out.println(d);
		System.out.println(p);
	}
	
	private static int countDigit(int d){
		int count=0;
		while(d>0){
			count++;
			d/=10;
		}
		return count;
	}
	
	private static int power(int n,int a){
		int p=1;
		for(int i=1;i<=a;i++){
			p=p*n;
		}
		return p;
	}
}