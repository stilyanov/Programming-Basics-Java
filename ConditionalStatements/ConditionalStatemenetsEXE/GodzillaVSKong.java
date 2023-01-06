package ConditionalStatemenetsEXE;

import java.util.Scanner;

public class GodzillaVSKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statistics = Integer.parseInt(scanner.nextLine());
        double clothes = Double.parseDouble(scanner.nextLine());

        double filmDecor = budget * 0.1;
        double clothesPrice = statistics * clothes;


        if (statistics > 150) {
            clothesPrice = clothesPrice * 0.9;
        }

        double moviePrice = filmDecor + clothesPrice;
        if (moviePrice > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", moviePrice - budget);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - moviePrice);
        }
    }
}
