import java.util.Scanner;

public class TennisRankList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());

        int points = 0;
        int winCount = 0;

        for (int i = 0; i < tournaments; i++) {
            String stages = scanner.nextLine();

            switch (stages) {
                case "W":
                    points += 2000;
                    winCount++;
                    break;
                case "F":
                    points += 1200;
                    break;
                case "SF":
                    points += 720;
                    break;
            }
        }
        int finalPoints = points + startPoints;
        int averagePoints = points / tournaments;
        double percentWin = (winCount * 1.0 / tournaments) * 100;

        System.out.printf("Final points: %s%n", finalPoints);
        System.out.printf("Average points: %s%n", averagePoints);
        System.out.printf("%.2f%%", percentWin);
    }
}
