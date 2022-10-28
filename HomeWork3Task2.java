import java.util.Scanner;

public class HomeWork3Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter digit");
        int digit = scanner.nextInt();

        if (digit % 2 == 0) {
            System.out.println("Even integer: " + digit);
        } else {
            System.out.println("Odd integer: " + digit);
        }
        scanner.close();
    }

}

