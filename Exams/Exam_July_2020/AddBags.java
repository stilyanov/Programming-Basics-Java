package Exam_July_2020;

import java.util.Scanner;

public class AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bagPrice20kg = Double.parseDouble(scanner.nextLine());
        double bagKG = Double.parseDouble(scanner.nextLine());
        int daysUntilTravel = Integer.parseInt(scanner.nextLine());
        int bagsCount = Integer.parseInt(scanner.nextLine());

        if (bagKG < 10) {
            bagPrice20kg = bagPrice20kg * 0.20;
        } else if (bagKG >= 10 && bagKG <= 20) {
            bagPrice20kg = bagPrice20kg * 0.50;
        }

        if (daysUntilTravel > 30) {
            bagPrice20kg = bagPrice20kg + (bagPrice20kg * 0.10);
        } else if (daysUntilTravel >= 7 && daysUntilTravel <= 30) {
            bagPrice20kg = bagPrice20kg + (bagPrice20kg * 0.15);
        } else if (daysUntilTravel < 7) {
            bagPrice20kg = bagPrice20kg + (bagPrice20kg * 0.40);
        }

        double totalPrice = bagPrice20kg * bagsCount;
        System.out.printf("The total price of bags is: %.2f lv.", totalPrice);
    }
}
