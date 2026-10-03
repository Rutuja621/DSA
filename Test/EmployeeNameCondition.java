/*
 
Q4. A company stores employee names. 
     Find all names that satisfy the following conditions: 
• Starts with a vowel  
• Ends with a consonant  
• Contains at least two vowels  
     Print all matching names along with total count. 
     Explanation - Comparison should be case-insensitive. 
     Input - Enter number of employees: 5 
     Names: Amit  Omkar  Eesha  Aniket  Uday 
     Output - Matching Names 
Amit 
Aniket 

     Total = 2*/
import java.util.*;
public class EmployeeNameCondition{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of employees: ");
		int n = sc.nextInt();
		String names[] = new String[n];
		System.out.println("Enter names: ");
		
		for(int i=0;i<names.length;i++){
			names[i] = sc.next(); //Inputing names
		}
		
		for(int i=0;i<names.length;i++){
			String s = names[i];
				if(isVowel(s.charAt(0)) && isConsonent(s.charAt(s.length()-1)) && TwoVowel(s)){//check if all cases are matiching
					System.out.print(s+" ");
				}
		}
	}
//check vowel
	public static boolean isVowel(char ch){
		if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || 
		ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				return true;
			}
			else{
				return false;
			}
	}
	
//isConsonent
	public static boolean isConsonent(char ch){
		if(!(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || 
		ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || (ch>=0 && ch<=9)))
		{
			return true;//if condition satisfy
		}
		else{
			return false;//if condition not satisfy
		}
	}
//check atleast  TwoVowel count
	public static boolean TwoVowel(String s){
		int count=0;
		for(int i=0;i<s.length();i++){
			char ch = s.charAt(i);
			if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || 
			ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				count++;
			}
		}
		if(count>=2){
			return true;
		}
		else{
			return false;
		}
	}
	
	
}