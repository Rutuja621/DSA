import java.util.Scanner;
public class PowerCalsulation{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter base: ");
		int base=sc.nextInt();
		
		System.out.println("Enter exponent: ");
		int exponent=sc.nextInt();
		
		System.out.println(base+"^"+exponent+"= "+getPower(base,exponent));
		
	}
	
	public static int getPower(int base,int exponent){
		if(exponent == 0){
			return 1;
		}
		
		return base*getPower(base,exponent-1);
	}
}