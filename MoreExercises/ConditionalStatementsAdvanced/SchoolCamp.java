package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();//“Winter”, “Spring” или “Summer”;
        String groupType = scanner.nextLine();//“boys”, “girls” или “mixed”;
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;
        String sports = "";
        switch (season) {
            case "Winter":
                if (groupType.equals("boys")) {
                    totalPrice = nights * 9.60;
                    sports = "Judo";
                } else if (groupType.equals("girls")) {
                    totalPrice = nights * 9.60;
                    sports = "Gymnastics";
                } else if (groupType.equals("mixed")) {
                    totalPrice = nights * 10;
                    sports = "Ski";
                }
                break;
            case "Spring":
                if (groupType.equals("boys")) {
                    totalPrice = nights * 7.20;
                    sports = "Tennis";
                } else if (groupType.equals("girls")) {
                    totalPrice = nights * 7.20;
                    sports = "Athletics";
                } else if (groupType.equals("mixed")) {
                    totalPrice = nights * 9.50;
                    sports = "Cycling";
                }
                break;
            case "Summer":
                if (groupType.equals("boys")) {
                    totalPrice = nights * 15;
                    sports = "Football";
                } else if (groupType.equals("girls")) {
                    totalPrice = nights * 15;
                    sports = "Volleyball";
                } else if (groupType.equals("mixed")) {
                    totalPrice = nights * 20;
                    sports = "Swimming";
                }
                break;
        }
        totalPrice = totalPrice * students;
        if (students >= 20 && students < 50) {
            totalPrice = totalPrice - (totalPrice * 0.15);
        } else if (students >= 10 && students < 20) {
            totalPrice = totalPrice - (totalPrice * 0.05);
        } else if (students >= 50) {
            totalPrice = totalPrice - (totalPrice * 0.50);
        }

        System.out.printf("%s %.2f lv.", sports, totalPrice);
    }
}
