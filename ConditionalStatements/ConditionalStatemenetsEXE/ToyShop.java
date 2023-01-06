package ConditionalStatemenetsEXE;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double trip = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double countToys = puzzles + dolls + bears + minions + trucks;
        double sumToys = puzzles * 2.60 + dolls * 3 + bears * 4.10 + minions * 8.20 + trucks * 2;

        if (countToys >= 50) {
            sumToys = sumToys - (sumToys * 0.25);
        }
        sumToys = sumToys - (sumToys * 0.1);

        if (sumToys >= trip) {
            System.out.printf("Yes! %.2f lv left.", sumToys - trip);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", trip - sumToys);
        }
    }
}
