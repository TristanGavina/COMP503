//This import is necessary for your program to run in code validator
import java.lang.reflect.*;

public class Album 
{
    private String title;
    private String artist;

    public Album(String title, String artist) 
    {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() 
    {
        return title;
    }

    public String getArtist() 
    {
        return artist;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public void setArtist(String artist) 
    {
        this.artist = artist;
    }

    public static void main(String[] args) 
    {
        Album album = new Album("Good Tunes", "Great Artist");

        System.out.println("title = " + album.getTitle());
        System.out.println("artist =  " + album.getArtist());

        album.setTitle("Great Tunes");

        album.setArtist("Better Artist");

        System.out.println("title = " + album.getTitle());
        System.out.println("artist =  " + album.getArtist());
    }
}
