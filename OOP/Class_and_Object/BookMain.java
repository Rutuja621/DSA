import java.util.Scanner;

class Book{
	int bookId;
	String bookName;
	int price;
	
	public void setData(int bookId ,String bookName, int price){
		this.bookId=bookId;
		this.bookName=bookName;
		this.price=price;
		
	}
	
	public void getData(){
		System.out.println("Book Id: "+bookId);
		System.out.println("Book Name: "+bookName);
		System.out.println("Book price: "+price);
		
	}

}
public class BookMain{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter bookId: ");
		int Id=sc.nextInt();
		
		
		System.out.println("Enter bookName: ");
		String Name=sc.next();
		
		System.out.println("Enter price: ");
		int price1=sc.nextInt();
		
		Book bk=new Book();
		
		bk.setData(Id,Name,price1);
		bk.getData();
		
		
		
	}





}