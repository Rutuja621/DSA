class Book{
    //instance variables
    int bookID;
    String title;
    String author;
    double price;
    String status;

    //static variables
    static  String LibraryName="Library";
    static int totalBooks=0;

    Book(int bookID,String title,String author,double price){
         this.bookID=bookID;
         this.title=title;
         this.author=author;
         this.price=price;
         totalBooks++;
    }

    void issueBook(){
        status="Issued";

    }

    void displayBook(){
        System.out.println("BookId: "+bookID);
        System.out.println("Title: "+title);
        System.out.println("author: "+author);
        System.out.println("Status: "+status);
        System.out.println("price: "+price);
        System.out.println(LibraryName);
    }
}


public class LibraryManagement {


    public static void main(String[] args) {
        // Array of objects
        Book[] books = new Book[1000];

        books[0]=new Book(101,"Java","James Ghosling",500);
        books[1]=new Book(102,"C++","Jam",600);
        books[2]=new Book(103,"C#","John",400);

        //Test case 1
        System.out.println("Total Books: "+Book.totalBooks);

        //test case 2
        books[0].issueBook();

        //test case 3
        books[0].displayBook();

        Book.LibraryName="College Library";
        System.out.println("After changing library name:");

        books[0].displayBook();
        System.out.println();
        books[1].displayBook();
        System.out.println();
        books[2].displayBook();



    }
}
