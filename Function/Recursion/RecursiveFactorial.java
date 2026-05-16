import java.util.Scanner;

public class RecursiveFactorial{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		int result=factorial(num);
		System.out.println("Factorial: "+ result);
		
	}
	
	public static int factorial(int n){
		if(n==0 || n==1){
			return 1;
		}
		
		return n*factorial(n-1);

	}


}