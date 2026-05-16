import java.util.Scanner;

public class RecursionFindGCD{
	public static void main(String []arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		int result=findGCD(num1,num2);
		System.out.println(result);

	}
	
	
	public static int findGCD(int a,int b){
		if(b == 0){
			return a;
		}
		
		return findGCD(b,a%b);	
		
	}
}