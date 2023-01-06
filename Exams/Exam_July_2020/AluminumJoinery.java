package Exam_July_2020;

import java.util.Scanner;

public class AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int windows = Integer.parseInt(scanner.nextLine());
        String typeWindows = scanner.nextLine();
        String delivery = scanner.nextLine();
        double price = 0;



        switch (typeWindows) {
            case "90X130":
                price = windows * 110;
                if (windows >= 60) {
                    price = price - (price * 0.08);
                } else if (windows >= 30) {
                    price = price - (price * 0.05);
                }
                break;
            case "100X150":
                price = windows * 140;
                if (windows >= 80) {
                    price = price - (price * 0.10);
                } else if (windows >= 40) {
                    price = price - (price * 0.06);
                }
                break;
            case "130X180":
                price = windows * 190;
                if (windows >= 50) {
                    price = price - (price * 0.12);
                } else if (windows >= 20) {
                    price = price - (price * 0.07);
                }
                break;
            case "200X300":
                price = windows * 250;
                if (windows >= 50) {
                    price = price - (price * 0.14);
                } else if (windows >= 25) {
                    price = price - (price * 0.09);
                }
                break;

        }

        if (windows <= 10) {
            System.out.println("Invalid order");
        } else if (delivery.equals("With delivery")) {
            price = price + 60;

            if (windows >= 99) {
                price = price - (price * 0.04);
            }
            System.out.printf("%.2f BGN", price);
        } else if (delivery.equals("Without delivery")) {
            System.out.printf("%.2f BGN", price);
        }
    }
}