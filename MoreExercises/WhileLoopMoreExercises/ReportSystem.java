package WhileLoopMoreExercises;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = Integer.parseInt(scanner.nextLine());
        String priceObject = scanner.nextLine();

        double successfulCardTransaction = 0;
        double cardPayments = 0;

        double successfulCashTransaction = 0;
        double cashPayments = 0;

        double totalSum = 0;
        int counter = 0;
        while (!priceObject.equals("End")){
            int nextMoney = Integer.parseInt(priceObject);

            counter++;

            if (counter % 2 == 0 && nextMoney >= 10) {
                successfulCardTransaction++;
                cardPayments += nextMoney;
                totalSum += nextMoney;
                System.out.println("Product sold!");
            } else if (counter % 2 != 0 && nextMoney <= 100) {
                successfulCashTransaction++;
                cashPayments += nextMoney;
                totalSum += nextMoney;
                System.out.println("Product sold!");
            } else {
                System.out.println("Error in transaction!");
            }


            if (totalSum > sum) {
                break;
            }


            priceObject = scanner.nextLine();
        }
        if (totalSum >= sum) {
            double averageCash = cashPayments / successfulCashTransaction;
            double averageCard = cardPayments / successfulCardTransaction;
            System.out.printf("Average CS: %.2f%n", averageCash);
            System.out.printf("Average CC: %.2f", averageCard);
        } else {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}
