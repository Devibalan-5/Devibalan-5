public class Main
{
    public static void main(String[] args)
    {
        //default car
        Car defaultcar = new Car();
        System.out.println("DefaultCar :");
        System.out.println("Make :"+defaultcar.getMake());
        System.out.println("Model :"+defaultcar.getModel());
        System.out.println("Year :"+defaultcar.getYear());

        //CustomerCar
        Car customerCar = new Car("jaguarCar","SUVs",2024);
        System.out.println("CustomerCar :");
        System.out.println("Make :"+customerCar.getMake());
        System.out.println("Model :"+customerCar.getModel());
        System.out.println("Year :"+customerCar.getYear());
    }
}