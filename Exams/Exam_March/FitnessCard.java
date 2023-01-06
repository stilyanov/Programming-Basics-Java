package Exam_March;

import java.util.Scanner;

public class FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        •	Сумата, с която разполагаме - реално число в интервала [10.00…1000.00]
//•     	Пол - символ ('m' за мъж и 'f' за жена)
//•        	Възраст - цяло число в интервала [5…105]
//•     	Спорт - текст (една от възможностите в таблицата)
        double sum = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();
        double cardPrice = 0;

        switch (sport) {
            case "Gym":
                if (gender.equals("m")) {
                    cardPrice = 42;
                } else if (gender.equals("f")) {
                    cardPrice = 35;
                }
                break;
            case "Boxing":
                if (gender.equals("m")) {
                    cardPrice = 41;
                } else if (gender.equals("f")) {
                    cardPrice = 37;
                }
                break;
            case "Yoga":
                if (gender.equals("m")) {
                    cardPrice = 45;
                } else if (gender.equals("f")) {
                    cardPrice = 42;
                }
                break;
            case "Zumba":
                if (gender.equals("m")) {
                    cardPrice = 34;
                } else if (gender.equals("f")) {
                    cardPrice = 31;
                }
                break;
            case "Dances":
                if (gender.equals("m")) {
                    cardPrice = 51;
                } else if (gender.equals("f")) {
                    cardPrice = 53;
                }
                break;
            case "Pilates":
                if (gender.equals("m")) {
                    cardPrice = 39;
                } else if (gender.equals("f")) {
                    cardPrice = 37;
                }
                break;
        }
        if (age <= 19) {
            cardPrice = cardPrice - (cardPrice * 0.20);
        }
        if (sum >= cardPrice) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more.", Math.abs(cardPrice - sum));
        }
    }
}
