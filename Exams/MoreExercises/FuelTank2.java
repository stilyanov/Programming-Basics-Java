package MoreExercises;

import java.util.Scanner;

public class FuelTank2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Типа на горивото – текст с възможности: "Gas", "Gasoline" или "Diesel"
        //•	Количество гориво – реално число в интервала [1.00 … 50.00]
        //•	Притежание на клубна карта – текст с възможности: "Yes" или "No"
        String fuelType = scanner.nextLine();
        double fuel = Double.parseDouble(scanner.nextLine());
        String card = scanner.nextLine();

        double gasoline = fuel * 2.22;
        double diesel = fuel * 2.33;
        double gas = fuel * 0.93;
        double finalPrice = 0.0;
        if (card.equals("Yes")) { //намаления за литър гориво: 18 ст. за литър бензин, 12 ст. за литър дизел и 8 ст. за литър газ.
            if ("Gasoline".equals(fuelType)) {
                finalPrice = (2.22 - 0.18) * fuel;
            } else if ("Diesel".equals(fuelType)) {
                finalPrice = (2.33 - 0.12) * fuel;
            } else if ("Gas".equals(fuelType)) {
                finalPrice = (0.93 - 0.08) * fuel;
            }
        } else {
            if (fuelType.equals("Gasoline")) {
                finalPrice = gasoline;
            } else if (fuelType.equals("Diesel")) {
                finalPrice = diesel;
            } else if (fuelType.equals("Gas")) {
                finalPrice = gas;
            }
        }

        if (fuel > 25) {
            finalPrice = finalPrice - (finalPrice * 0.10);
        } else if (fuel > 20) {
            finalPrice = finalPrice - (finalPrice * 0.08);
        }

        System.out.printf("%.2f lv.", finalPrice);

    }
}
