package Exam_July_2019;

import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double entry = Double.parseDouble(scanner.nextLine());
        double sunLounger = Double.parseDouble(scanner.nextLine()); // шезлонг
        double umbrella = Double.parseDouble(scanner.nextLine());

        double entryPrice = people * entry;
        double percentLounger = Math.ceil(people * 0.75);
        double sunLoungerPrice = percentLounger * sunLounger;
        double percentUmbrella = Math.ceil(people * 0.5);
        double umbrellaPrice = percentUmbrella * umbrella;

        double totalPrice = entryPrice + sunLoungerPrice + umbrellaPrice;

        System.out.printf("%.2f lv.", totalPrice);
    }
}
