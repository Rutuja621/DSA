/*
Create a Book class with:

bookId
title
author

Initialize values using a constructor. Store 4 books in an array and display all books.*/
import java.util.Scanner;
class BookConstructor{
	int bookId;
	String title;
	String author;
	
	BookConstructor(){
		System.out.println("Book Details");
	}
	
	BookConstructor(int bookId,String title,String author){
		this.bookId=bookId;
		this.title=title;
		this.author=author;
	}
	
	void display(){
		System.out.println(" bookId: "+bookId);
		System.out.println(" title: "+title);
		System.out.println(" author: "+author);
		
	}



}


public class BookConstructorMain{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		BookConstructor bk=new BookConstructor();
		BookConstructor arr[]=new BookConstructor[2];
		
		for(int i=0;i<arr.length;i++){
		   System.out.println("Enter bookId: ");
		  int bookId=sc.nextInt();
		
		  System.out.println("Enter title: ");
		  String title=sc.next();
		
		  System.out.println("Enter author: ");
          String author=sc.next();
		  
		  arr[i] = new BookConstructor(bookId, title, author);
		  
		   
		
		}
		for (int i = 0; i < arr.length; i++) {
            arr[i].display();
          }

	}


}