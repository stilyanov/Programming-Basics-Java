package Exam_July_2020;

import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ако топката е “red” точките ни се повишават с 5.
        // Ако топката е “orange” точките ни се повишават с 10.
        // Ако топката е “yellow” точките ни се повишават с 15.
        // Ако топката е “white” точките ни се повишават с 20.
        // Ако топката е “black” точките ни се делят на 2, като закръгляме към по-малкото цяло число.

        int number = Integer.parseInt(scanner.nextLine());

        int totalPoints = 0;
        int redBalls = 0;
        int orangeBalls = 0;
        int yellowBalls = 0;
        int whiteBalls = 0;
        int otherColors = 0;
        int divided = 0;

        for (int i = 1; i <= number; i++) {
            String nextColor = scanner.nextLine();

            switch (nextColor) {
                case "red":
                    redBalls++;
                    totalPoints = totalPoints + 5;
                    break;
                case "orange":
                    orangeBalls++;
                    totalPoints = totalPoints + 10;
                    break;
                case "yellow":
                    yellowBalls++;
                    totalPoints = totalPoints + 15;
                    break;
                case "white":
                    whiteBalls++;
                    totalPoints = totalPoints + 20;
                    break;
                case "black":
                    divided++;
                    totalPoints = totalPoints / 2;
                    break;
                default:
                    otherColors++;
                    break;
            }
        }
        System.out.printf("Total points: %d%n", totalPoints);
        System.out.printf("Red balls: %d%n", redBalls);
        System.out.printf("Orange balls: %d%n", orangeBalls);
        System.out.printf("Yellow balls: %d%n", yellowBalls);
        System.out.printf("White balls: %d%n", whiteBalls);
        System.out.printf("Other colors picked: %d%n", otherColors);
        System.out.printf("Divides from black balls: %d%n", divided);
    }
}
