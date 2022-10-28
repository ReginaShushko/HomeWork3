import java.util.Scanner;

public class HomeWork3Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter day");
        int day = scanner.nextInt();
        System.out.println("Enter month");
        int month = scanner.nextInt();
        System.out.println("Enter year");
        int year = scanner.nextInt();

        if ((day <= 31) && month == 1) {
            day++;
            System.out.println("Next day: " + day + " Jan " + year);
        } else if ((day <= 28) && (month == 2)) {
            day++;
            System.out.println("Next day: " + day + " Feb " + year);
        } else if ((day <= 30) && (month == 3)) {
            day++;
            System.out.println("Next day: " + day + " Mar " + year);
        } else if ((day <= 30) && (month == 4)) {
            day++;
            System.out.println("Next day: " + day + " Apr " + year);
        } else if ((day <= 31) && (month == 5)) {
            day++;
            System.out.println("Next day: " + day + " May " + year);
        } else if ((day <= 30) && (month == 6)) {
            day++;
            System.out.println("Next day: " + day + " Jun " + year);
        } else if ((day <= 31) && (month == 7)) {
            day++;
            System.out.println("Next day: " + day + " Jul " + year);
        } else if ((day <= 31) && (month == 8)) {
            day++;
            System.out.println("Next day: " + day + " Aug " + year);
        } else if ((day <= 30) && (month == 9)) {
            day++;
            System.out.println("Next day: " + day + " Sep " + year);
        } else if ((day <= 31) && (month == 10)) {
            day++;
            System.out.println("Next day: " + day + " Oct " + year);
        } else if ((day <= 30) && (month == 11)) {
            day++;
            System.out.println("Next day: " + day + " Nov " + year);
        } else if ((day <= 30) && (month == 12)) {
            day++;
            System.out.println("Next day: " + day + " Dec " + year);
        }
    }
}
