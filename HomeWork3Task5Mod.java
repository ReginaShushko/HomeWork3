import java.util.Scanner;

public class HomeWork3Task5Mod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter day");
        int day = scanner.nextInt();
        System.out.println("Enter month");
        int month = scanner.nextInt();
        System.out.println("Enter year");
        int year = scanner.nextInt();

        switch (month) {
            case 1:
                int numDays = 31;
                if (day < numDays) {
                    System.out.println("Next day: " + ++day + " Jan " + year);
                } else if (day == numDays) {
                    day = 1;
                    System.out.println("Next day: " + day + " Feb " + year);
                }
                break;
            case 3:
                int numDays2 = 31;
                if (day < numDays2) {
                    System.out.println("Next day: " + ++day + " Mar " + year);
                } else if (day == numDays2) {
                    day = 1;
                    System.out.println("Next day: " + day + " Apr " + year);
                }
                break;
            case 5:
                int numDays3 = 31;
                if (day < numDays3) {
                    System.out.println("Next day: " + ++day + " May " + year);
                } else if (day == numDays3) {
                    day = 1;
                    System.out.println("Next day: " + day + " Jun " + year);
                }
                break;
            case 7:
                int numDays4 = 31;
                if (day < numDays4) {
                    System.out.println("Next day: " + ++day + " Jul " + year);
                } else if (day == numDays4) {
                    day = 1;
                    System.out.println("Next day: " + day + " Aug " + year);
                }
                break;
            case 8:
                int numDays5 = 31;
                if (day < numDays5) {
                    System.out.println("Next day: " + ++day + " Aug " + year);
                } else if (day == numDays5) {
                    day = 1;
                    System.out.println("Next day: " + day + " Sep " + year);
                }
                break;
            case 10:
                int numDays6 = 31;
                if (day < numDays6) {
                    System.out.println("Next day: " + ++day + " Oct " + year);
                } else if (day == numDays6) {
                    day = 1;
                    System.out.println("Next day: " + day + " Nov " + year);
                }
                break;
            case 12:
                int numDays7 = 31;
                if (day <= numDays7 && month <12) {
                    System.out.println("Next day: " + ++day + " Dec " + year);
                } else if (day == 31 && month == 12) {
                    day = 1;
                    year++;
                    System.out.println("Next day: " + day + " Jan " + year);
                }
                break;
            case 2:
                int numDays8 = 28;
                if (day < numDays8 && ((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
                    System.out.println("Next day: " + ++day + " Feb " + year);
                } else if (day == numDays8 && (year % 4 >= 1)) {
                    day = 1;
                    System.out.println("Next day: " + day + " Mar " + year);
                }
                break;
            case 4:
                int numDays9 = 30;
                if (day < numDays9) {
                    System.out.println("Next day: " + ++day + " Apr " + year);
                } else if (day == numDays9) {
                    day = 1;
                    System.out.println("Next day: " + day + " May " + year);
                }
                break;
            case 6:
                int numDays10 = 30;
                if (day < numDays10) {
                    System.out.println("Next day: " + ++day + " Jun " + year);
                } else if (day == numDays10) {
                    day = 1;
                    System.out.println("Next day: " + day + " Jul " + year);
                }
                break;
            case 9:
                int numDays11 = 30;
                if (day < numDays11) {
                    System.out.println("Next day: " + ++day + " Sep " + year);
                } else if (day == numDays11) {
                    day = 1;
                    System.out.println("Next day: " + day + " Oct " + year);
                }
                break;
            case 11:
                int numDays12 = 30;
                if (day < numDays12) {
                    System.out.println("Next day: " + ++day + " Nov " + year);
                } else if (day == numDays12) {
                    day = 1;
                    System.out.println("Next day: " + day + " Dec " + year);
                }
                break;
            default:
                System.out.println("Error. Month is indefinite.");
                break;
        }

        scanner.close();
    }
}
