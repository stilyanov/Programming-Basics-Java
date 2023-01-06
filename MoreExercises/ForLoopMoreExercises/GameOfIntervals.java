package ForLoopMoreExercises;

import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int moves = Integer.parseInt(scanner.nextLine());

        double points = 0;
        double total = 0;
        double firstGroup = 0;
        double secondGroup = 0;
        double thirdGroup = 0;
        double fourthGroup = 0;
        double fifthGroup = 0;
        double invalidGroup = 0;

        for (int i = 1; i <= moves; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());

            if (numbers >= 0 && numbers <= 9) {
                firstGroup++;
                points = numbers * 0.20 + points;
            } else if (numbers >= 10 && numbers <= 19) {
                secondGroup++;
                points = numbers * 0.30 + points;
            } else if (numbers >= 20 && numbers <= 29) {
                thirdGroup++;
                points = numbers * 0.40 + points;
            } else if (numbers >= 30 && numbers <= 39) {
                fourthGroup++;
                points += 50;
            } else if (numbers >= 40 && numbers <= 50) {
                fifthGroup++;
                points += 100;
            } else {
                invalidGroup++;
                points = points / 2;
            }
        }
        System.out.printf("%.2f%n", points);
        System.out.printf("From 0 to 9: %.2f%%%n", firstGroup / moves * 100);
        System.out.printf("From 10 to 19: %.2f%%%n", secondGroup / moves * 100);
        System.out.printf("From 20 to 29: %.2f%%%n", thirdGroup / moves * 100);
        System.out.printf("From 30 to 39: %.2f%%%n", fourthGroup / moves * 100);
        System.out.printf("From 40 to 50: %.2f%%%n", fifthGroup / moves * 100);
        System.out.printf("Invalid numbers: %.2f%%", invalidGroup / moves * 100);
    }
}
