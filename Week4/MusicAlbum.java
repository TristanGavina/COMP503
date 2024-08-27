package Week4;

public class MusicAlbum {
	String title;
	String artist;
	String genre;
	int numberOfTracks;
	
	public MusicAlbum (String title, String artist, String genre, int numberOfTracks) {
		this.title = title;
		this.artist = artist;
		this.genre = genre;
		this.numberOfTracks = numberOfTracks;
	}
	public void displayAlbumInfo() {
		System.out.println("Title = " +this.title);
		System.out.println("Artist = " +this.artist);
		System.out.println("Genre = " +this.genre);
		System.out.println("Number of Tracks = " +this.numberOfTracks);
	}
	
	public static void main(String[] args) {
		MusicAlbum ma = new MusicAlbum("Thriller", "Micheal Jackson", "Pop", 9);
		ma.displayAlbumInfo();
	}

}
