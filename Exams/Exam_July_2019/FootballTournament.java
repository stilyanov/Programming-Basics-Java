package Exam_July_2019;

import java.util.Scanner;

public class FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String footballTeam = scanner.nextLine();
        int matchesPlayed = Integer.parseInt(scanner.nextLine());

        int countW = 0;
        int countD = 0;
        int countL = 0;
        double totalPoints = 0;

        for (int result = 1; result <= matchesPlayed; result++) {
            String nextResult = scanner.nextLine();

            switch (nextResult) {
                case "W":
                    countW++;
                    break;
                case "D":
                    countD++;
                    break;
                case "L":
                    countL++;
                    break;
            }
        }
        totalPoints = countW * 3 + countD;
        double wins = countW * 100.0 / matchesPlayed;

        if (matchesPlayed == 0) {
            System.out.printf("%s hasn't played any games during this season.", footballTeam);
        } else {
            System.out.printf("%s has won %d points during this season.%n", footballTeam, (int) totalPoints);
            System.out.println("Total stats:");
            System.out.printf("## W: %d%n", countW);
            System.out.printf("## D: %d%n", countD);
            System.out.printf("## L: %d%n", countL);
            System.out.printf("Win rate: %.2f%%", wins);
        }
    }
}
