package NestedLoops;

import java.util.Scanner;

public class HappyCatParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double totalDays = 0;
        double total = 0;

        for (int i = 1; i <= days; i++) {
            for (int j = 1; j <= hours; j++) {
                if (i % 2 == 0 & j % 2 != 0) {
                    totalDays += 2.50;
                    total += 2.50;
                } else if (i % 2 != 0 & j % 2 == 0) {
                    totalDays += 1.25;
                    total += 1.25;
                } else {
                    totalDays += 1;
                    total += 1;
                }
            }
            System.out.printf("Day: %d - %.2f leva%n", i, totalDays);
            totalDays = 0;
        }
        System.out.printf("Total: %.2f leva", total);
    }
}
