package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Първият ред – броят младши велосипедисти. Цяло число в интервала [1…100]
        //•	Вторият ред – броят старши велосипедисти. Цяло число в интервала [1… 100]
        //•	Третият ред – вид трасе – "trail", "cross-country", "downhill" или "road"
        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String trace = scanner.nextLine();

        double players = juniors + seniors;
        double taxJuniors = 0;
        double taxSeniors = 0;
        double totalPrice = 0;
        double expenses = 0;

        switch (trace) {
            case "trail":
                taxJuniors = juniors * 5.50;
                taxSeniors = seniors * 7;
                totalPrice = taxJuniors + taxSeniors;
                break;
            case "cross-country":
                taxJuniors = juniors * 8;
                taxSeniors = seniors * 9.50;
                totalPrice = taxJuniors + taxSeniors;
                if (players >= 50) {
                        totalPrice = totalPrice - (totalPrice * 0.25);
                }
                break;
            case "downhill":
                taxJuniors = juniors * 12.25;
                taxSeniors = seniors * 13.75;
                totalPrice = taxJuniors + taxSeniors;
                break;
            case "road":
                taxJuniors = juniors * 20;
                taxSeniors = seniors * 21.50;
                totalPrice = taxJuniors + taxSeniors;
                break;
        }
        expenses = totalPrice * 0.05;
        System.out.printf("%.2f", totalPrice - expenses);
    }
}
