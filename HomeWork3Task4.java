import java.util.Scanner;

public class HomeWork3Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many seconds?");
        int s = scanner.nextInt();
        int sec = s % 60;
        int min = s / 60;
        int hr = min / 60;

        if (s >=60) {
            min = s / 60;
            sec = s - min * 60;
        } if (min >= 60){
            hr = min / 60;
            min -= hr * 60;
        }
        System.out.println(hr + " hr " + min + " min " + sec + " sec ");
        scanner.close();
    }
}
