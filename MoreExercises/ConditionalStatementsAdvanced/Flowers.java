package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysanthemums = Integer.parseInt(scanner.nextLine()); //хризантеми
        int roses = Integer.parseInt(scanner.nextLine());//рози
        int tulips = Integer.parseInt(scanner.nextLine());//лалета
        String season = scanner.nextLine();//[Spring, Summer, Аutumn, Winter]
        String yesOrNo = scanner.nextLine();//[Y – да / N - не]

        double flowers = chrysanthemums + roses + tulips;
        double totalPrice = 0;
        switch (season) {
            case "Spring":
            case "Summer":
                totalPrice = (chrysanthemums * 2) + (roses * 4.10) + (tulips * 2.50);
                if (yesOrNo.equals("Y")) {
                    totalPrice = totalPrice + (totalPrice * 0.15);
                }
                if (season.equals("Spring") && tulips >= 7) {
                    totalPrice = totalPrice - (totalPrice * 0.05);
                }
                break;
            case "Autumn":
            case "Winter":
                totalPrice = (chrysanthemums * 3.75) + (roses * 4.50) + (tulips * 4.15);
                if (yesOrNo.equals("Y")) {
                    totalPrice = totalPrice + (totalPrice * 0.15);
                }
                if (season.equals("Winter") && roses >= 10) {
                    totalPrice = totalPrice - (totalPrice * 0.10);
                }
                    break;
        }
        if (flowers >= 20) {
            totalPrice = totalPrice - (totalPrice * 0.20);
        }
        System.out.printf("%.2f", totalPrice + 2);
    }
}
