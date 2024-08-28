public class Book1 {
    // Declare private instance variables
    private String title;
    private String author;

    // Constructor method with input parameters for title and author
    public Book1(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Get method for title
    public String getTitle() {
        return title;
    }

    // Get method for author
    public String getAuthor() {
        return author;
    }

    public static void main(String[] args) {
        // Create a Book instance with "Pride and Prejudice" for title and "Jane Austen" for author
        Book1 book = new Book1("Pride and Prejudice", "Jane Austen");

        // Print the value of each instance variable using the get methods
        System.out.println("title = " + book.getTitle());
        System.out.println("author = " + book.getAuthor());

    }
}
