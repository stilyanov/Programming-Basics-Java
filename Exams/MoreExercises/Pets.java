package MoreExercises;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine()); // брой дни
        int foodKG = Integer.parseInt(scanner.nextLine()); // оставена храна в килограми
        double dog = Double.parseDouble(scanner.nextLine());
        double cat = Double.parseDouble(scanner.nextLine());
        double turtle = Double.parseDouble(scanner.nextLine());

        double dogFood = dog * days;
        double catFood = cat * days;
        double turtleFood = turtle * days / 1000;
        double totalFood = dogFood + catFood + turtleFood;

        if (totalFood <= foodKG) {
            System.out.printf("%d kilos of food left.",(int) Math.floor(foodKG - totalFood));
        } else if (totalFood > foodKG) {
            System.out.printf("%d more kilos of food are needed.",(int) Math.ceil(totalFood - foodKG));
        }
    }
}
