public class RecursiveConstructorCall{
	
	/*public static void m1(){
		m2();
		
	}
	
	public static void m2(){
		m1();
	}
	
	
	public static void main(String [] arg){
		m1();
		System.out.println("Hello");
		//runtime error
		
	}

*/

      RecursiveConstructorCall(){
		this(10);
		
	}
	
	RecursiveConstructorCall(int i){
	   this();
	}
	
	
	public static void main(String [] arg){
	
		System.out.println("Hello");
		
		
	}



}