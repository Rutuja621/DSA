public class CountUpperLowerCaseLetter{
	
	public static void main(String [] arg){
		String str="Qutuja";
		int lower=0;
		int upper=0;
		
		for(int i=0;i<str.length();i++){
			/*if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
				
			}*/
			
			if(str.charAt(i)>='a' && str.charAt(i)<='z'){
				lower++;
				
			}else if(str.charAt(i) >='A' && str.charAt(i)<='Z'){
				upper++;
			}
			
		}
		System.out.println("lowerCaseLetter: "+lower);
		System.out.println("upperCaseLetter: "+upper);
		
		
	}




}