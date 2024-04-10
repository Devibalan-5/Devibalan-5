// Jvdroid-main: 
import java.util.Scanner;
public class Employee {
    private int emId;
    private String emName;
    private double salary;

    public Employee(int emId, String emName, double salary) {
        this.emId= emId;
        this.emName=emName;
        this.salary=salary;
    }
    public Employee() 
    {
        
    }
    public int getEmId() {
        return emId;
    }

    public void setEmId(int emId) {
        this.emId = emId;
    }

    public String getEmName() {
        return emName;
    }

    public void setEmName(String emName) {
        this.emName = emName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary= salary;
    }
    public void inputEmployee(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee Id:");
        this.emId=scanner.nextInt();
        System.out.println("Enter employee name:");
        scanner.nextLine();
        this.emName=scanner.nextLine();
        System.out.println("Enter employee salary:");
        this.salary=scanner.nextDouble();
    }
}