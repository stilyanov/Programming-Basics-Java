package MoreExercises;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnolias = Integer.parseInt(scanner.nextLine());// магнолии
        int hyacinths = Integer.parseInt(scanner.nextLine());  // зюмбюли
        int roses = Integer.parseInt(scanner.nextLine());   // рози
        int cacti = Integer.parseInt(scanner.nextLine());   // кактуси
        double priceGift = Double.parseDouble(scanner.nextLine());

        double sum = magnolias * 3.25 + hyacinths * 4 + roses * 3.50 + cacti * 8;
        double taxesSum = sum * 0.05;
        double profit = sum - taxesSum;
        if (profit < priceGift) {
            System.out.printf("She will have to borrow %d leva.", (int) Math.ceil(priceGift - profit));
        } else if (profit >= priceGift) {
            System.out.printf("She is left with %d leva.", (int) Math.floor(profit - priceGift));
        }
    }
}
