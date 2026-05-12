import java.util.*;
public class PerfectNo{
public static void main(String [] arg){
	Scanner sc=new Scanner(System.in);
          
	      System.out.println("Enter size of an array: ");	  
		  int size=sc.nextInt();
		  
		  
		  int [] arr=new int[size];//array
		  System.out.println("Enter array elements: ");
		  for(int i=0;i<size;i++){
			  arr[i]=sc.nextInt();//input elements
		  
		  }
		  
		int count=0;
		for(int i=0;i<arr.length;i++){ 
		int num=arr[i];// assign current val
        int sum=0;//to store sum
		int j=1;
		while(j<num){
			if(num%j==0){//check divisors
			sum=sum+j;//add divisor to sum
			
			}
            j++;	//increment		
		}
		if(sum==num){//check if sum is equal to num
			count++;//to count the perfect no
			
		}
		
		 }
		 System.out.println("Perfect No count: "+count);//print count

}


}