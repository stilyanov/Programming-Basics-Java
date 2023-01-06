package Exam_July_2019;

import java.util.Scanner;

public class TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        String packAge = scanner.nextLine();
        String vip = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double discount = 0;

        boolean cityValid = !city.equals("Bansko") && !city.equals("Borovets") && !city.equals("Varna") && !city.equals("Burgas");

        if (days > 7) {
            days--;
        }
        switch (city) {
            case "Bansko":
            case "Borovets":
                if (packAge.equals("withEquipment")) {
                    price = 100;
                    if (vip.equals("yes")) {
                        discount = 0.10;
                    }
                    price = price - (price * discount);
                } else if (packAge.equals("noEquipment")) {
                    price = 80;
                    if (vip.equals("yes")) {
                        discount = 0.05;
                    }
                    price = price - (price * discount);
                }
                break;
            case "Varna":
            case "Burgas":
                if (packAge.equals("withBreakfast")) {
                    price = 130;
                    if (vip.equals("yes")) {
                        discount = 0.12;
                    }
                    price = price - (price * discount);
                } else if (packAge.equals("noBreakfast")) {
                    price = 100;
                    if (vip.equals("yes")) {
                        discount = 0.07;
                    }
                    price = price - (price * discount);
                }
                break;
        }
        price *= days;

        if (days < 1) {
            System.out.println("Days must be positive number!");
        } else if (cityValid) {
            System.out.println("Invalid input!");
        } else if (!packAge.equals("noEquipment") && !packAge.equals("withEquipment") && !packAge.equals("noBreakfast") && !packAge.equals("withBreakfast")) {
            System.out.println("Invalid input!");
        } else {
            System.out.printf("The price is %.2flv! Have a nice time!", price);
        }
    }
}
