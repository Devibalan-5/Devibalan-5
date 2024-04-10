public class Car
 {
    private String make;
    private String model;
    private int year;

    //Default Constructor
    public Car()
    {

    }
    //Overload Constructor
    public Car(String make,String model,int year)
    {
        this.make=make;
        this.model=model;
        this.year=year;
    }

    //getter Method
    public String getMake()
    {
        return make;
    }
    public String getModel()
    {
        return model;
    }
    public int getYear()
    {
        return year;
    }
}