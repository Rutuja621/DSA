import java.util.Scanner;

public class FuncLagestThreeNo{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		
		findLargest(a,b,c);
		


	}
	
	public static void findLargest(int a,int b,int c){
		if(a > b && a>c){
			System.out.println("First Number is greater");
			
		}else if(b>a && b>c){
			System.out.println("Second Number is greater");
		}else{
			
			System.out.println("Third Number is greater");
		}
		
		
	}




}