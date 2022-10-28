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

        int middleDigit = (digit1 + digit2 + digit3) / 3;
        System.out.println("Middle digit: " + middleDigit);
        scanner.close();
    }
}