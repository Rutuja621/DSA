import java.util.Scanner;
public class RecursiveSumNaturalNum{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
        
		System.out.println("Enter natural number: ");
		int n=sc.nextInt();
		
		if(n<0){
			System.out.println("Please enter positive integer");
			
		}else{
			System.out.println("Sum of "+n+" natural number is: "+getSum(n));
		}
	}
	
	public static int getSum(int n){
		if(n <= 1){
			return n;
	    }
		return n+getSum(n-1);
		}

}