//Find the first non-repeated character

public class NonRepeatedChar{
	
	public static void main(String [] arg){
		String s="rutuja";
		
		int []arr=new int[26];
		
		for(int i=0;i<s.length();i++){
			arr[s.charAt(i)-'a']++;		
		}
		
		System.out.println("NonRepeatedCharacters are: ");
		for(int i=0;i<s.length();i++){
			if(arr[s.charAt(i)-'a']==1){
				System.out.println(s.charAt(i));
			}
			
		}
		
		
	}




}