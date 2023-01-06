package Exam_July_2020;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxGoals = Integer.MIN_VALUE;
        String bestPlayer = "";

        String player = scanner.nextLine();
        while (!player.equals("END")) {
            int goals = Integer.parseInt(scanner.nextLine());


            if (goals > maxGoals) {
                maxGoals = goals;
                bestPlayer = player;

                if (maxGoals >= 10) {
                    break;
                }
            }

            player = scanner.nextLine();
        }

        System.out.printf("%s is the best player!%n", bestPlayer);
        if (maxGoals >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoals);
        } else {
            System.out.printf("He has scored %d goals.", maxGoals);
        }
    }
}

