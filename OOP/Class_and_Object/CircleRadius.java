import java.util.Scanner;

class CircleRadius{
	
	
	public static int getAdd(int r){
		return r*r*r;
		
		
	}
	
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter radius of circle: ");
		int radius=sc.nextInt();
		
		
		
		int result=CircleRadius.getAdd(radius);
		System.out.println("Area of circle is: "+result);
		
	}

}

