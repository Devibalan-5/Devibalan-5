public class Main
{
    public static void main (String[] args)
    {
        Student student1=new Student(1234);
        Student student2=new Student(5678,"karthi");
        Student student3=new Student(6789,"Devibalan",20);
        
        //Student 1
        System.out.println("Student 1 :");
        System.out.println("ID :"+student1.getStudentId());
        System.out.println("Name :"+student1.getStudentName());
        System.out.println("Age :"+student1.getAge());
        
        //Student2
        System.out.println("Student 2 :");
        System.out.println("ID :"+student2.getStudentId());
        System.out.println("Name :"+student2.getStudentName());
        System.out.println("Age :"+student2.getAge());
        
        //Student3
        System.out.println("Student 3 :");
        System.out.println("ID :"+student3.getStudentId());
        System.out.println("Name :"+student3.getStudentName());
        System.out.println("Age :"+student3.getAge());
    }
}