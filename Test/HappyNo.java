//Write a java program to check Number Is happy Number or Not happy using function recursion.
import java.util.Scanner;
public class HappyNo{
	
	public boolean getHappyNo(int num){
		int sum=0;
		while(num != 1 && num != 4){
			
			
			int digit=num % 10;
			sum=digit * digit;
			num/=10;		
			
			getHappyNo(9);
		}


		return false;
	}
	
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		HappyNo hp=new HappyNo();
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		if(hp.getHappyNo(num)){
			System.out.println("Happy Number");
			
		}else{
			System.out.println("Not an happy number");
		}
		
		
		
	}
	
	

}