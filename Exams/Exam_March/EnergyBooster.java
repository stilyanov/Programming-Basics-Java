package Exam_March;

import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//1.	Плод - текст с възможности: "Watermelon", "Mango", "Pineapple" или "Raspberry"
//2.	Размерът на сета - текст с възможности: "small" или "big"
//3.	Брой на поръчаните сетове - цяло число в интервала [1 … 10000]
        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double totalPrice = 0;
        double discount = 0;

        switch (fruit) {
            case "Watermelon":
                if (size.equals("small")) {
                price = 2 * 56;
                totalPrice = price * number;
                } else if (size.equals("big")) {
                    price = 5 * 28.70;
                    totalPrice = price * number;
                }
                break;
            case "Mango":
                if (size.equals("small")) {
                    price = 2 * 36.66;
                    totalPrice = price * number;
                } else if (size.equals("big")) {
                    price = 5 * 19.60;
                    totalPrice = price * number;
                }
                break;
            case "Pineapple":
                if (size.equals("small")) {
                    price = 2 * 42.10;
                    totalPrice = price * number;
                } else if (size.equals("big")) {
                    price = 5 * 24.80;
                    totalPrice = price * number;
                }
                break;
            case "Raspberry":
                if (size.equals("small")) {
                    price = 2 * 20;
                    totalPrice = price * number;
                } else if (size.equals("big")) {
                    price = 5 * 15.20;
                    totalPrice = price * number;
                }
                break;
        }
        if (totalPrice >= 400 && totalPrice <=1000){
            discount = totalPrice - (totalPrice * 0.15);
            System.out.printf("%.2f lv.", discount);
        } else if (totalPrice > 1000) {
            discount = totalPrice - (totalPrice * 0.50);
            System.out.printf("%.2f lv.", discount);
        } else {
            System.out.printf("%.2f lv.", totalPrice);
        }
    }
}
