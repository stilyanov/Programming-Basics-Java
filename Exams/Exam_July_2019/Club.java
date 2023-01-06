package Exam_July_2019;

import java.util.Scanner;

public class Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double target = Double.parseDouble(scanner.nextLine());
        String cocktail = scanner.nextLine();

        double income = 0;

        while (!cocktail.equals("Party!")) {
            int ordersCocktail = Integer.parseInt(scanner.nextLine());

            double price = ordersCocktail * cocktail.length();
            if (price % 2 !=  0) {
                price = price - (price * 0.25);
            }
            income = income + price;
            target = target - price;

            if (target <= 0) {
                break;
            }

            cocktail = scanner.nextLine();
        }

        if (cocktail.equals("Party!")) {
            System.out.printf("We need %.2f leva more.%n", target);
        } else {
            System.out.println("Target acquired.");
        }
        System.out.printf("Club income - %.2f leva.", income);
    }
}
