import java.util.Scanner;

public class RecusiveFibonacci{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		System.out.println(getFibonacci(n));



	}
	
	public static int getFibonacci(int n){
		if(n<=1) {
			return n;
		}
		
		return getFibonacci(n-1) + getFibonacci(n-2);
		
	}




}