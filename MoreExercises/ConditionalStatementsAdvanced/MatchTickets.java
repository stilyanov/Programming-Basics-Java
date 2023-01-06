package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	На първия ред е бюджетът – реално число в интервала [1 000.00 ... 1 000 000.00]
        //•	На втория ред е категорията – "VIP" или "Normal"
        //•	На третия ред е броят на хората в групата – цяло число в интервала [1 ... 200]
        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double transport = 0;
        double totalPrice = 0;

        if (people >= 1 && people <=4) {
            transport = budget * 0.75;
            totalPrice = budget - transport;
        } else if (people >= 5 && people <=9) {
            transport = budget * 0.60;
            totalPrice = budget - transport;
        } else if (people >= 10 && people <=24) {
            transport = budget * 0.50;
            totalPrice = budget - transport;
        } else if (people >=25 && people <=49) {
            transport = budget * 0.40;
            totalPrice = budget - transport;
        } else if (people >= 50) {
            transport = budget * 0.25;
            totalPrice = budget - transport;
        }

            switch (category) {
            case "VIP":
                price = people * 499.99;
                break;
            case "Normal":
                price = people * 249.99;
                break;
        }
        if (totalPrice > price) {
            System.out.printf("Yes! You have %.2f leva left.", totalPrice - price);
        } else if (price > totalPrice) {
            System.out.printf("Not enough money! You need %.2f leva.", price - totalPrice);
        }
    }
}
