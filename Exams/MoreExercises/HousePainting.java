package MoreExercises;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double door = 1.2 * 2;
        double windows = 2 * (1.5 * 1.5);
        double frontWall = 2 * (x * x) - door;
        double sideWall = 2 * (x * y) - windows;
        double wallArea = frontWall + sideWall;
        double greenPaint = wallArea / 3.4;

        double roofSquare = 2 * (x * y);
        double roofTriangle = x * h;
        double roofArea = roofSquare + roofTriangle;
        double redPaint = roofArea / 4.3;

        System.out.printf("%.2f", greenPaint);
        System.out.println();
        System.out.printf("%.2f", redPaint);
    }
}
