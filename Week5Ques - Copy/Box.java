//This import is necessary for your program to run in code validator
import java.lang.reflect.Field;

public class Box 
{
    private int height;
    private int width;
    private int depth;

    public Box(int height, int width, int depth) 
    {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public int getHeight() 
    {
        return height;
    }

    public int getWidth() 
    {
        return width;
    }

    public int getDepth() 
    {
        return depth;
    }


    public String toString() 
    {
        return "height = " + height + "\nwidth = " + width + "\ndepth = " + depth;
    }

    public boolean fits(Box box) 
    {
        return this.height > box.height && this.width > box.width && this.depth > box.depth;
    }

    public boolean fits(Box box1, Box box2) 
    {
        return this.fits(box1) && box1.fits(box2);
    }

    public static void main(String[] args) 
    {
        Box box1 = new Box(11, 21, 31);
        System.out.println(box1);

        Box box2 = new Box(21, 31, 41);
        System.out.println(box2);

        Box box3 = new Box(31, 41, 51);
        System.out.println(box3);

        System.out.println("fits = " + box1.fits(box2, box3));
    }
}
