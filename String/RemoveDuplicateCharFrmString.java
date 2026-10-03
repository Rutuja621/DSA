//Remove duplicate characters from a string.

public class RemoveDuplicateCharFrmString{
	
	public static void main(String [] arg){
		String str="rutujaa";
		
		char []ch=new char[str.length()];
		int count=0;
		
		for(int i=0;i<str.length();i++){
			char currentChar=str.charAt(i);
			
			boolean isSimilar=false;
			for(int j=0;j<str.length();j++){
				if(ch[j] == currentChar){
					isSimilar = true;
					break;
					
				}
				
			}
			
			if(!isSimilar){
				ch[count]=currentChar;
				count++;
				
			}
			
			
		}
		
		for(int i=0;i<count;i++){
			System.out.println(ch[i]);
		}
		

	}


}