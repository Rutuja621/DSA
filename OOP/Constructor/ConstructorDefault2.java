public class ConstructorDefault2{
	String name;
	int rollNo;
	
	ConstructorDefault2(){
		
		name="rutuja";
		rollNo=10;
		
		
		
	}
	
	void display(){
	   System.out.println("name: "+name+" rollNo: "+rollNo);
	
	}
	
	public static void main(String [] arg){
		
		ConstructorDefault2 s=new ConstructorDefault2();
		s.display();
	}









}