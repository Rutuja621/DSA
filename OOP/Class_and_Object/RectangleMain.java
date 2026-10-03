import java.util.Scanner;

class Rectangle{
	int length;
	int width;
	
	public void setData(int len, int wid){
		this.length=len;
		this.width=wid;
		
		
	}
	
	public int getData(){
		
		
		return length*width;
		
		
		
	}





}

public class RectangleMain{
	public static void main(String [] arg){
	Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter length: ");
		int length=sc.nextInt();
		
		System.out.println("Enter width: ");
		int width=sc.nextInt();
		
		Rectangle bk=new Rectangle();
		
		bk.setData(length,width);
		System.out.println("Area of Rectangle:  "+bk.getData()); 
		
	}

}