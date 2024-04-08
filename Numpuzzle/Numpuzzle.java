import java.util.Scanner;

public class Numpuzzle
 {
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scanner.nextInt();
        if (num > 9 || num >100)
        {
            if (num > 50)
            {
                int a = (num / 10 - num % 10);
                System.out.println(a);
            }
            else
            {
                int b = (num % 10 - num / 10);
                System.out.println(b);
            }
        }
     }
    else
     {
        System.out.println("Invaild number");
     }
 }
