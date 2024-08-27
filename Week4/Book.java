package Week4;

public class Book {
	// Declare instance variables
    String title;
    String author;

    //write constructor with input parameters for title and author
    public Book(String title, String author) {
    	this.title = title;
    	this.author = author;
    }
    public static void main(String[] args) {
        Book p = new Book("Pride and Prejudice", "Jane Austen");
        
     // Print Book instance variables in standard output format
        System.out.println("Title = " + p.title);
        System.out.println("Author = " + p.author);   
    }
}

