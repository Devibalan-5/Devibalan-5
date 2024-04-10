import java.util.Scanner;

public class NumberNames {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = num.nextInt();
        String numberNames = convert(number);
        
        System.out.println("Sample Output:");
        System.out.println(numberNames);
    }
    
    public static String convert(int number) {
        String[] numberNames = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String numberString = Integer.toString(number);
        String numberNamesString = "";
        
        for (int i = 0; i < numberString.length(); i++) {
            int digit = numberString.charAt(i) - '0'; // Convert char to int
            numberNamesString += numberNames[digit] + " ";
        }
        
        return numberNamesString;
    }
}
