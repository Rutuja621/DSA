/*
8. Calculate Power

Overload the method power() to:

Find square of a number.
Find cube of a number.
Find x raised to y.*/



import java.util.Scanner;
class CalculatePower{
	
	public int power(int num){
		return num * num;
		
	}

    public int power(float num){
		return num * num*num;
		
	}

    public int power(int num,int pow){
		
		int count=0;
		int res=1;
		if(count <= pow){
			res *= num;
			count++;
		}
		return res;
	}





}

public class CalculatePowerMain{
	public static void main(String []arg){
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a num1: ");
		int num=sc.nextInt();
		
        System.out.println("Enter a num2: ");
		int pow=sc.nextInt();
		
		
		 CalculatePower p=new CalculatePower();
		
		p.power(num);
		p.power((float)num);
		p.power(num,pow);
		


	}



}