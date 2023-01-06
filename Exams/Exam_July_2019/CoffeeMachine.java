package Exam_July_2019;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        int countDrinks = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        switch (drink) {
            case "Espresso":
                if (sugar.equals("Without")) {
                totalPrice = totalPrice + (countDrinks * 0.90);
                totalPrice = totalPrice - (totalPrice * 0.35);
                } else if (sugar.equals("Normal")) {
                    totalPrice = totalPrice + (countDrinks * 1.0);
                } else if (sugar.equals("Extra")) {
                    totalPrice = totalPrice + (countDrinks * 1.20);
                }
                if (countDrinks >= 5) {
                    totalPrice = totalPrice - (totalPrice * 0.25);
                }
                break;
            case "Cappuccino":
                if (sugar.equals("Without")) {
                    totalPrice = totalPrice + (countDrinks * 1.00);
                    totalPrice = totalPrice - (totalPrice * 0.35);
                } else if (sugar.equals("Normal")) {
                    totalPrice = totalPrice + (countDrinks * 1.20);
                } else if (sugar.equals("Extra")) {
                    totalPrice = totalPrice + (countDrinks * 1.60);
                }
                break;
            case "Tea":
                if (sugar.equals("Without")) {
                    totalPrice = totalPrice + (countDrinks * 0.50);
                    totalPrice = totalPrice - (totalPrice * 0.35);
                } else if (sugar.equals("Normal")) {
                    totalPrice = totalPrice + (countDrinks * 0.60);
                } else if (sugar.equals("Extra")) {
                    totalPrice = totalPrice + (countDrinks * 0.70);
                }
                break;
        }
        if (totalPrice > 15) {
            totalPrice = totalPrice - (totalPrice * 0.20);
        }
        System.out.printf("You bought %s cups of %s for %.2f lv.", countDrinks, drink, totalPrice);
    }
}
