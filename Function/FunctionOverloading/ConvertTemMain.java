/*
6. Convert Temperature

Overload the method convert() to:

Convert Celsius to Fahrenheit.
Convert Fahrenheit to Celsius.*/



import java.util.Scanner;
class ConvertTemprature{
	
	public void convert(double celcious){
	    double fahrenheit=(9.0/5)*celcious+32;
		System.out.println("celcious to fahrenheit: "+fahrenheit);
		
	}

    public void convert(int fahrenheit){
		double celcious=(5.0/9)*(fahrenheit-32);
	    System.out.println("fahrenheit to celcious: "+celcious);
	  
		
	}

}

public class ConvertTemMain{
	public static void main(String []arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter temprature in celcious: ");
		double s1=sc.nextInt();
		
		System.out.println("Enter temprature in fahrenheit: ");
		int s2=sc.nextInt();
		
        
		
		
		
		ConvertTemprature temp=new ConvertTemprature();
		
		temp.convert(s1);
	    temp.convert(s2);
	
		


	}



}