/*
7. Find Average

Overload the method average() to calculate:

Average of two numbers.
Average of three numbers.
Average of four numbers.*/



import java.util.Scanner;
class CalculateAverage{
	
	public void average(int s1,int s2){
	    System.out.println("Average of two numbers:" +((s1+s2)/2));
		
	}

    public void average(int a,int b,int c){
	    System.out.println("Average of three numbers:" +((a+b+c)/3));
		
	
	  
		
	}

    public void average(int a,int b,int c,int d){
		
		 System.out.println("Average of four numbers: "+((a+b+c+d)/4));
	}





}

public class CalculateAverageMain{
	public static void main(String []arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num1: ");
		int s1=sc.nextInt();
		
        System.out.println("Enter a num2: ");
		int s2=sc.nextInt();
		
		System.out.println("Enter a num3: ");
		int s3=sc.nextInt();
		
		System.out.println("Enter a num4: ");
		int s4=sc.nextInt();
		
		CalculateAverage max=new CalculateAverage();
		
		max.average(s1,s2);
		max.average(s1,s2,s3);
		max.average(s1,s2,s3,s4);
		


	}



}