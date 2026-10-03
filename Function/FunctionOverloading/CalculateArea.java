/*
2. Calculate Area of Different Shapes

Overload the method area() to calculate:

Area of a square (side).
Area of a rectangle (length, width).
Area of a circle (radius).*/

import java.util.Scanner;
class CalculateAreaDiffShapes{
	
	public void areaApp(float side){
		System.out.println("Area of square: "+side * side);
		
	}

    public void areaApp(float length,float width){
		System.out.println("Area of rectangle: "+length * width);
		
	}

    public void areaApp(double radius){
		
		System.out.println("Area of square: "+3.14*radius*radius);
	}





}

public class CalculateArea{
	public static void main(String []arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a side: ");
		float side=sc.nextInt();
		
        System.out.println("Enter a length: ");
		float length=sc.nextInt();
		
		System.out.println("Enter a width: ");
		float width=sc.nextInt();
		
		System.out.println("Enter a radius: ");
		double radius=sc.nextInt();
		
		CalculateAreaDiffShapes shapes=new CalculateAreaDiffShapes();
		
		shapes.areaApp(side);
		shapes.areaApp(length,width);
		shapes.areaApp(radius);
		


	}



}