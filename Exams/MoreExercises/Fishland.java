package MoreExercises;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //скумрия
        double mackerel = Double.parseDouble(scanner.nextLine());
        //цаца
        double sprinkle = Double.parseDouble(scanner.nextLine());
        //паламуд
        double bonito = Double.parseDouble(scanner.nextLine());
        //сафрид
        double scad = Double.parseDouble(scanner.nextLine());
        //миди
        int mussels = Integer.parseInt(scanner.nextLine());

        double bonitoPrice = mackerel + (mackerel * 0.6);
        double bonitoSum = bonitoPrice * bonito;
        double scadPrice = sprinkle + (sprinkle * 0.8);
        double scadSum = scadPrice * scad;
        double musslesPrice = mussels * 7.50;
        double totalPrice = bonitoSum + scadSum + musslesPrice;

        System.out.printf("%.2f", totalPrice);
    }
}
