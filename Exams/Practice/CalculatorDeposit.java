package Exercises3;

import java.util.Scanner;

public class CalculatorDeposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        // сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
        double total = money + months * ((money * percent / 100) / 12);

        System.out.println(total);

    }
}
