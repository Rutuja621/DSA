/*5. Calculate Volume

Overload the method volume() to calculate:

Volume of a cube.
Volume of a cuboid.
Volume of a cylinder.*/

import java.util.Scanner;
class CalculateVolume{
	
	public void volume(float side){
		System.out.println("volume of cube: "+side * side*side);
		
	}

    public void volume(float length,float width,float height){
		System.out.println("volume of cuboid: "+length * width*height);
		
	}

    public void volume(double radius,double height){
		
		System.out.println("volume of cylinder: "+3.14*radius*height);
	}





}

public class CalculateVolumeMain{
	public static void main(String []arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a side: ");
		float side=sc.nextInt();
		
        System.out.println("Enter a length: ");
		float length=sc.nextInt();
		
		System.out.println("Enter a width: ");
		float width=sc.nextInt();
		
		System.out.println("Enter a height: ");
		float height=sc.nextInt();
		
		System.out.println("Enter a radius: ");
		double radius=sc.nextInt();
		
		 CalculateVolume volumes=new CalculateVolume();
		
		volumes.volume(side);
		volumes.volume(length,width,height);
		volumes.volume(radius,height);
		


	}



}