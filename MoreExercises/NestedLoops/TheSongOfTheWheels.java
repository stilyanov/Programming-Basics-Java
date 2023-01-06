package NestedLoops;

import java.util.Scanner;

public class TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        int first = 1;
        int second = 1;
        int third = 1;
        int fourth = 1;

        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {
                        boolean isEqual = (a * b) + (c * d) == m;

                        if (isEqual && a < b && c > d) {
                            System.out.printf("%d%d%d%d ", a, b, c, d);
                            counter++;

                            if (counter == 4) {
                                first = a;
                                second = b;
                                third = c;
                                fourth = d;
                            }
                        }
                    }
                }
            }
        }
        if (counter >= 4) {
            System.out.println();
            System.out.printf("Password: %d%d%d%d", first, second, third, fourth);
        } else {
            System.out.println();
            System.out.println("No!");
        }
    }
}
