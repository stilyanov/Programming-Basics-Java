package MoreExercises;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vegetablePrice = Double.parseDouble(scanner.nextLine());
        double fruitPrice = Double.parseDouble(scanner.nextLine());
        int vegetableKG = Integer.parseInt(scanner.nextLine());
        int fruitKG = Integer.parseInt(scanner.nextLine());

        double totalVegetablePrice = vegetablePrice * vegetableKG;
        double totalFruitPrice = fruitPrice * fruitKG;
        double totalBGN = totalVegetablePrice + totalFruitPrice;
        double total = totalBGN / 1.94;

        System.out.printf("%.2f", total);
    }
}
