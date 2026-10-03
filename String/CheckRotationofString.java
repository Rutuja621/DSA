//Check whether one string is a rotation of another

public class CheckRotationofString{
	public static boolean isRotation(String s1,String s2){
		if(s1 == null || s2==null || s1.length() != s2.length() ){
			return false;
			
		}
		
		String concatinated=s1+s1;
		return concatinated.contains(s2);
		
		
		
	}
	
	public static void main(String [] arg){
		String s1="ABCD";
		String s2="CDAB";
		
		if(isRotation(s1,s2)){
			System.out.println(s2+" is a rotation of "+s1);
			
		}else{
			System.out.println(s2+" is not a rotation of "+s1);
		}
		
	}





}