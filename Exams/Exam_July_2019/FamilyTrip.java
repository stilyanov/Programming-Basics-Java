package Exam_July_2019;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double nightsPrice = Double.parseDouble(scanner.nextLine());
        double expenses = Double.parseDouble(scanner.nextLine());

        double totalNightsPrice = 0;
        double totalPrice = 0;
        if (nights > 7) {
            totalNightsPrice = nightsPrice - (nightsPrice * 0.05);
            totalNightsPrice = totalNightsPrice * nights;
        } else {
            totalNightsPrice = nightsPrice * nights;
        }

        totalPrice = budget * (expenses / 100);
        totalPrice = totalPrice + totalNightsPrice;

        if (totalPrice <= budget) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - totalPrice);
        } else {
            System.out.printf("%.2f leva needed.", totalPrice - budget);
        }


    }
}
