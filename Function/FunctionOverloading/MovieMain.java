/*
Private variables:

Movie name
Director
Rating

Display using getter methods.*/
import java.util.Scanner;
class Movie{
	private String Moviename;
	private String DirectorName;
	private float rating;
	
	
	
	public void setMovieName(String name){
			this.Moviename=name;
		
	}
	
	public String getMovieName(){
		return Moviename;
			
	}
	
	public void setDirectorName(String DName){
			this.DirectorName=DName;
		
	}
	
	public String getDirectorName(){
		return DirectorName;
			
	}
	
	
	public void setRating(float rate){
			this.rating=rate;
		
	}
	
	public float getRating(){
		return rating;
			
	}
	



}

public class MovieMain{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a movie name: ");
		String name=sc.next();
		
		System.out.println("Enter Director name: ");
		String DName=sc.next();
		
		System.out.println("Enter a rating: ");
		float rating=sc.nextFloat();
		
		Movie m=new Movie();
		m.setMovieName(name);
		System.out.println(m.getMovieName());
		
		m.setDirectorName(DName);
		System.out.println(m.getDirectorName());
		
		m.setRating(rating);
		System.out.println(m.getRating());
		
		
		
	}


}