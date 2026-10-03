/*
3. Find Maximum Number

Overload the method max() to find:

Maximum of two integers.
Maximum of three integers.
Maximum of two double values.*/


import java.util.Scanner;
class FindMaxNum{
	
	public void maxNum(int s1,int s2){
	    if(s1>s2){
		System.out.println("Max integer: "+s1);
		}else{
		System.out.println("Max integer: "+s2);
		
		}
		
	}

    public void maxNum(int a,int b,int c){
		if(a>b && a>c){
		System.out.println("Max: "+a);
		}else if(b>a && b>c){
		System.out.println("Max three integer: "+b);
		
		}else{
			System.out.println("Max three integer: "+c);
			
		}
	
	  
		
	}

    public void maxNum(double s1,double s2){
		
		if(s1>s2){
		System.out.println("Max Double: "+s1);
		}else{
		System.out.println("Max double: "+s2);
		
		}
	}





}

public class FindMaxNumMain{
	public static void main(String []arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num1: ");
		int s1=sc.nextInt();
		
        System.out.println("Enter a num2: ");
		int s2=sc.nextInt();
		
		System.out.println("Enter a num3: ");
		int s3=sc.nextInt();
		
		
		
		FindMaxNum max=new FindMaxNum();
		
		max.maxNum(s1,s2);
		max.maxNum(s1,s2,s3);
		max.maxNum((double)s1,(double)s2);
		


	}



}