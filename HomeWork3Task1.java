import java.util.Scanner;

public class HomeWork3Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st digit");
        int digit1 = scanner.nextInt();
        System.out.println("Enter 2nd digit");
        int digit2 = scanner.nextInt();
        System.out.println("Enter 3rd digit");
        int digit3 = scanner.nextInt();

        if ((digit1 - digit2) * (digit3 - digit1) >= 0) {              // a >= b and a <= c OR a <= b and a >= c
            System.out.print(digit1);
        } else if ((digit2 - digit1) * (digit3 - digit2) >= 0) {       // b >= a and b <= c OR b <= a and b >= c
            System.out.print(digit2);
        } else {
            System.out.print(digit3);
        }

        scanner.close();
    }
}