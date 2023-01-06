package Exercises3;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegMenu = Integer.parseInt(scanner.nextLine());

        double chickenPrice = chickenMenu * 10.35;
        double fishPrice = fishMenu * 12.40;
        double vegPrice = vegMenu * 8.15;

        double pricesMenu = chickenPrice + fishPrice + vegPrice;
        double desertPrice = pricesMenu * 0.20;
        double total = pricesMenu + desertPrice + 2.50;

        System.out.println(total);
    }
}
