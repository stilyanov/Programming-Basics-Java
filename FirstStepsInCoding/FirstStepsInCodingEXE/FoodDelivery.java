package FirstStepsInCodingEXE;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegetarian = Integer.parseInt(scanner.nextLine());

        double chickenPrice = chicken * 10.35;
        double fishPrice = fish * 12.40;
        double vegetarianPrice = vegetarian * 8.15;

        double totalPrice = chickenPrice + fishPrice + vegetarianPrice;
        double desert = totalPrice * 20 / 100.00;
        double total = totalPrice + desert + 2.50;

        System.out.println(total);
    }
}
