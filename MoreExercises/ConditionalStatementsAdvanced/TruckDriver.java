package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kilometers = Double.parseDouble(scanner.nextLine());

        double priceKilometers = 0;
        double total = 0;
        double taxes = 0;
        switch (season) {
            case "Spring":
            case "Autumn":
                if (kilometers <= 5000) {
                    priceKilometers = kilometers * 0.75;
                } else if (kilometers > 5000 && kilometers <= 10000) {
                    priceKilometers = kilometers * 0.95;
                }
                break;
            case "Summer":
                if (kilometers <= 5000) {
                    priceKilometers = kilometers * 0.90;
                } else if (kilometers > 5000 && kilometers <= 10000) {
                    priceKilometers = kilometers * 1.10;
                }
                break;
            case "Winter":
                if (kilometers <= 5000) {
                    priceKilometers = kilometers * 1.05;
                } else if (kilometers > 5000 && kilometers <= 10000) {
                    priceKilometers = kilometers * 1.25;
                }
                break;
        }

        if (kilometers > 10000 && kilometers <= 20000) {
            priceKilometers = kilometers * 1.45;
        }

        total = priceKilometers * 4;
        taxes = total - (total * 0.10);
        System.out.printf("%.2f", taxes);
    }
}
