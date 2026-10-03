import java.util.Scanner;

class Addition{
	
	
	public static int getAdd(int num1,int num2){
		return num1+num2;
		
		
	}
	
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter num1: ");
		int num1=sc.nextInt();
		
		System.out.println("Enter num2: ");
		int num2=sc.nextInt();
		
		int result=Addition.getAdd(num1,num2);
		System.out.println("Addition is: "+result);
		
	}





}

