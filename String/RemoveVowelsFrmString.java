//Remove all vowels from a string.
import java.util.Scanner;
public class RemoveVowelsFrmString{
	public static void main(String [] arg){
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter a string: ");
	String st=sc.next();
	String str="";
	
	for(int i=0;i<st.length();i++){
		if(st.charAt(i) == 'a' || st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o' || st.charAt(i) == 'u'){
			continue;
		}
		str=str+st.charAt(i);

	}
	System.out.print(str);
	}


}