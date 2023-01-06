package Exam_July_2020;

import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int adultTickets = Integer.parseInt(scanner.nextLine());
        int kidTickets = Integer.parseInt(scanner.nextLine());
        double priceAdult = Double.parseDouble(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());

        double childPrice = priceAdult - (priceAdult * 0.70);
        double taxAdult = priceAdult + tax;
        double childTax = childPrice + tax;

        double totalPrice = (kidTickets * childTax) + (adultTickets * taxAdult);
        double profit = totalPrice * 0.2;
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", text, profit);
    }
}
