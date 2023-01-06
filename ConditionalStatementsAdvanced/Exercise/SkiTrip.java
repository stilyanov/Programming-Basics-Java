package Exercise;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String grade = scanner.nextLine();

        double nights = days - 1;
        double discount = 0;
        double nightsPrice = 0;
        double totalPrice = 0;
        switch (room) {
            case "room for one person":
                nightsPrice = 18;
                totalPrice = nights * nightsPrice;
                break;
            case "apartment":
                nightsPrice = 25;
                totalPrice = nightsPrice * nights;
                if (nights < 10) {
                    totalPrice = totalPrice * 0.70;
                } else if (nights > 10 && nights < 15) {
                    totalPrice = totalPrice * 0.65;
                } else if (nights > 15) {
                    totalPrice = totalPrice * 0.50;
                }
                break;
            case "president apartment":
                nightsPrice = 35;
                totalPrice = nightsPrice * nights;
                if (nights < 10) {
                    totalPrice = totalPrice * 0.90;
                } else if (nights > 10 && nights < 15) {
                    totalPrice = totalPrice * 0.85;
                } else if (nights > 15) {
                    totalPrice = totalPrice * 0.80;
                }
                break;
        }
        if (grade.equals("positive")) {
            totalPrice = totalPrice + (totalPrice * 0.25);
            System.out.printf("%.2f", totalPrice);
        }else if (grade.equals("negative")) {
            totalPrice = totalPrice - (totalPrice * 0.10);
            System.out.printf("%.2f", totalPrice);
        }
    }
}
