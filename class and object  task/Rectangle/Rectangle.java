import java.util.*;
public class Rectangle
{
    private int length;
    private int width;

    public Rectangle(int length,int width)
    {
        this.length=length;
        this.width=width;
    }
    //setter method for length and width
    public void setLength(int lenth)
    {
        this.length=length;
    }
    public void setWidth(int width)
    {
        this.width=width;
    }
    //getter method for lenth and width
    public int getLength()
    {
        return length;
    }
    public int getWidth()
    {
        return width;
    }
    //Taking user input 
    public void inputAngle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lengh :");
        this.length=sc.nextInt();
        System.out.println("Enter width :");
        this.width=sc.nextInt();
    }
}