package Week5;
import java.lang.reflect.*;
public class Book {
	private String title;
	private String author;
	
	//Constructor
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	//Get method
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	
	public static void main(String[] args) {
		//New instance and constructor input
		Book book = new Book("Pride and Prejudice", "Jane Austen");
		System.out.println("title = " + book.getTitle());
		System.out.println("author = " + book.getAuthor());
	}
}
