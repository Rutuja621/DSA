import java.util.Scanner;

public class StudMark{
	
	int id;
	String name;
    int mark;
	
	
	public void setMarks(int id,String n,int mark){
		this.id=id;
		this.name=n;
		this.mark=mark;
		
	}
	
	public void showResult(){
		System.out.println("id : "+id);
		System.out.println("name : "+name);
		System.out.println("mark : "+mark);
		
		
	}
	
	public static void main(String []arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter id: ");
		int id=sc.nextInt();
		
		System.out.println("Enter name: ");
		String str=sc.next();
		
		System.out.println("mark: ");
		int mark=sc.nextInt();
		
		
		StudMark st=new StudMark();
		st.setMarks(id,str,mark);
		st.showResult();
		if(mark >35){
			System.out.println("Pass");
			
		}else{
			System.out.println("Fail");
			
		}
		
		
		
		
		
	}
	


}