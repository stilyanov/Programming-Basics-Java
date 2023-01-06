package MoreExercises;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // w - дължина в метри
        // h - широчина в метри
        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        // от метри в сантиметри
        double wCentimeters = w * 100;
        double hCentimeters = (h * 100) - 100;
        double w1 = Math.floor(hCentimeters / 70);
        double h1 = Math.floor(wCentimeters / 120);

        double area = w1 * h1 - 3;
        System.out.println(area);
    }
}
