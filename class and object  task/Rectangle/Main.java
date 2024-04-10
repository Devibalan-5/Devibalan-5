public class Main 
{
	public static void main(String[] args) 
    {   
        Rectangle rectangle= new Rectangle(0,0);
        rectangle.inputAngle();
        System.out.println("Rectangle Length is:" + rectangle.getLength());
		System.out.println("Rectangle Width is:" + rectangle.getWidth());
    }
}
