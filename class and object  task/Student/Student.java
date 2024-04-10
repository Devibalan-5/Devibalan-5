public class Student
{
    //Student Details
    int studentId;
    String studentName;
    int age;

    //Constructor for only studentId
    public Student(int studentId)
    {
        this.studentId=studentId;
        this.studentName="Unknown";

    }
    //Constructor for studentId,studentName
    public Student(int studentId,String studentName)
    {
        this.studentId=studentId;
        this.studentName=studentName;
        this.age=0;
    }

    //Constructor for studentId,studentName,age
    public Student(int studentId,String studentName,int age)
    {
        this.studentId=studentId;
        this.studentName=studentName;
        this.age=age;
    }

    //getter Method
    public int getStudentId()
    {
        return studentId;
    }
    public String getStudentName()
    {
        return studentName;
    }
    public int getAge()
    {
        return age;
    }
}