import java.util.Scanner;

public class ExcursionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();

        double totalPrice = 0;

        if (season.equals("spring")) {
            if (people <= 5) {
                totalPrice = people * 50;
            } else if (people > 5) {
                totalPrice = people * 48;
            }
        } else if (season.equals("summer")) {
            if (people <= 5) {
                totalPrice = people * 48.50;
            } else if (people > 5) {
                totalPrice = people * 45;
            }
            totalPrice = totalPrice - (totalPrice * 0.15);
        } else if (season.equals("autumn")) {
            if (people <= 5) {
                totalPrice = people * 60;
            } else if (people > 5) {
                totalPrice = people * 49.50;
            }
        } else if (season.equals("winter")) {
            if (people <= 5) {
                totalPrice = people * 86;
            } else if (people > 5) {
                totalPrice = people * 85;
            }
            totalPrice = totalPrice + (totalPrice * 0.08);
        }
        System.out.printf("%.2f leva.", totalPrice);
    }
}
