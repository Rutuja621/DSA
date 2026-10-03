import java.util.Scanner;
public class Student{
   int id;
   String name;
   
   public void setData(int id,String n){
	   id=id;
	   name=n;
    
   }
   
   public void getData(){
	   System.out.println("Id : "+id);
	   System.out.println("name: "+name);
	   
   }
   
   public static void main(String [] arg){
	   Scanner sc=new Scanner(System.in);
	   
	   System.out.println("Enter Student id: ");
	   int id=sc.nextInt();
	   
	   System.out.println("Enter Student name: ");
	   String str=sc.next();
	   
	   Student st=new Student();
	   
	   st.setData(id,str);
	   st.getData();
	   
	   
   }



}