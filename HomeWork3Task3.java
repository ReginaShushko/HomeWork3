import java.util.Scanner;

public class HomeWork3Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter finger number");
        int handFinger = scanner.nextInt();

        switch (handFinger) {
            case 1:
                System.out.println("Thumb finger");
                break;
            case 2:
                System.out.println("Index finger");
                break;
            case 3:
                System.out.println("Middle finger");
                break;
            case 4:
                System.out.println("Ring finger");
                break;
            case 5:
                System.out.println("Little finger");
                break;
            default:
                System.out.println("Value is indefinite");
        }
        scanner.close();
    }
}