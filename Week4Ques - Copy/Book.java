public class Book {
    // declare instance variables
    String title;
    String author;
    
    // constructor to initialize Book objects with title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    public static void main(String[] args) {
        // create an instance of Book with constructor inputs
        Book b = new Book("Pride and Prejudice", "Jane Austen");
        
        // print the Book instance variables in standard output format
        System.out.println("Title = " + b.title);
        System.out.println("Author = " + b.author);
    }
}
