package ConditionalStatemenetsEXE;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        //•	Видеокарта – 250 лв./бр.
        //•	Процесор – 35% от цената на закупените видеокарти/бр.
        //•	Рам памет – 10% от цената на закупените видеокарти/бр.
        double priceVideoCard = videoCards * 250;
        double priceProcessors = priceVideoCard * 0.35;
        double priceRam = priceVideoCard * 0.1;
        double totalSum = priceVideoCard + priceProcessors * processors +  ram * priceRam;

        if (videoCards > processors) {
            totalSum = totalSum * 0.85;
        }

        if (budget >= totalSum) {
            System.out.printf("You have %.2f leva left!", budget - totalSum);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalSum - budget);
        }
    }
}
