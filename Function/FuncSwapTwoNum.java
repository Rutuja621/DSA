import java.util.Scanner;
public class FuncSwapTwoNum{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a num1: ");
		int num1=sc.nextInt();
		
		System.out.println("Enter a num2: ");
		int num2=sc.nextInt();
		System.out.println("Before Swapping: ");
		System.out.println("Num1: "+num1);
		System.out.println("Num2: "+num2);
		
	    int[] nums = {num1, num2};
        
       
        swapNo(nums);
        
        
        num1 = nums[0];
        num2 = nums[1];
		
		System.out.println("After swapping: ");
		System.out.println("Num1: "+num1);
		System.out.println("Num2: "+num2);


	}
	
	public static void swapNo(int[] arr){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}