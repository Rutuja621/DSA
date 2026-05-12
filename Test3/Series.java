/*
 
Q3. Write a Java program to display the following series:  
3   6   12   24   48   96  192  
(Each term doubles from the previous term starting at 3)
*/

public class Series{
	public static void main(String [] arg){
		int i=3;//start
		int j=1;//limit
		while(j<=7){
			System.out.print(i+" ");//print i
		    i=i*2;//to multiply i*2
			//System.out.print(i+" ");
			
			j++;//increment j after operation
		}
	}

}