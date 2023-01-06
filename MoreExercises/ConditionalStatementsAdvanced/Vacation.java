package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double totalPrice = 0;
        String location = "";
        String placesToStay = "";

        if (budget <= 1000) {
            placesToStay = "Camp";
            if (season.equals("Summer")) {
                location = "Alaska";
                totalPrice = budget * 0.65;
            } else if (season.equals("Winter")) {
                location = "Morocco";
                totalPrice = budget * 0.45;
            }
        } else if (budget > 1000 && budget <= 3000) {
            placesToStay = "Hut";
            if (season.equals("Summer")) {
                location = "Alaska";
                totalPrice = budget * 0.80;
            } else if (season.equals("Winter")) {
                location = "Morocco";
                totalPrice = budget * 0.60;
            }
        } else if (budget > 3000) {
            placesToStay = "Hotel";
            if (season.equals("Summer")) {
                location = "Alaska";
                totalPrice = budget * 0.90;
            } else if (season.equals("Winter")) {
                location = "Morocco";
                totalPrice = budget * 0.90;
            }
        }
        System.out.printf("%s - %s - %.2f", location, placesToStay, totalPrice);
    }
}
