package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine(); // Summer   Winter

        double totalPrice = 0;
        String classes = "";
        String car = "";
        if (budget < 100) {
            classes = "Economy class";
            if (season.equals("Summer")) {
                car = "Cabrio";
                totalPrice = budget * 0.35;
            } else if (season.equals("Winter")) {
                car = "Jeep";
                totalPrice = budget * 0.65;
            }
        } else if (budget > 100 && budget <= 500) {
            classes = "Compact class";
            if (season.equals("Summer")) {
                car = "Cabrio";
                totalPrice = budget * 0.45;
            } else if (season.equals("Winter")){
                car = "Jeep";
                totalPrice = budget * 0.80;
            }
        } else if (budget > 500) {
            classes = "Luxury class";
            if (season.equals("Summer") || season.equals("Winter")) {
                car = "Jeep";
                totalPrice = budget * 0.90;
            }
        }
        System.out.printf("%s%n", classes);
        System.out.printf("%s - %.2f", car, totalPrice);
    }
}
