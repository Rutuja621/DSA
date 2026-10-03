public class StaticKeywordDemo{
   static int count=0;
	StaticKeywordDemo(){
		count++;
		System.out.println("count : "+count);		
	}
	public static void main(String [] arg){
		StaticKeywordDemo st=new StaticKeywordDemo();
	
		StaticKeywordDemo st1=new StaticKeywordDemo();
		StaticKeywordDemo st2=new StaticKeywordDemo();
	}

}
