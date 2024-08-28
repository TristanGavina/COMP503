public class MusicAlbum {
    // Declare instance variables
    private String title;
    private String artist;
    private String genre;
    private int numberOfTracks;

    // Constructor
    public MusicAlbum(String title, String artist, String genre, int numberOfTracks) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.numberOfTracks = numberOfTracks;
    }

    // Method to display album information
    public void displayAlbumInfo() {
        System.out.println("Title = " + title);
        System.out.println("Artist = " + artist);
        System.out.println("Genre = " + genre);
        System.out.println("Number of Tracks = " + numberOfTracks);
    }

    public static void main(String[] args) {
        // Create instances of MusicAlbum
        MusicAlbum ma1 = new MusicAlbum("Thriller", "Michael \nJackson", "Pop", 9);

        // Invoke displayAlbumInfo method
        ma1.displayAlbumInfo();
    }
}
