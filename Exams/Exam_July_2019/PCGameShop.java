package Exam_July_2019;

import java.util.Scanner;

public class PCGameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soldGames = Integer.parseInt(scanner.nextLine());

        int hearthStone = 0;
        int fornite = 0;
        int overWatch = 0;
        int others = 0;

        for (int games = 1; games <= soldGames; games++) {
            String nameGame = scanner.nextLine();

            switch (nameGame) {
                case "Hearthstone":
                    hearthStone++;
                    break;
                case "Fornite":
                    fornite++;
                    break;
                case "Overwatch":
                    overWatch++;
                    break;
                default:
                    others++;
                    break;
            }
        }
        double hearthStonePercent = hearthStone * 1.0 / soldGames * 100;
        double fornitePercent = fornite * 1.0 / soldGames * 100;
        double overWatchPercent = overWatch * 1.0 / soldGames * 100;
        double othersPercent = others * 1.0 / soldGames * 100;
        System.out.printf("Hearthstone - %.2f%%%n", hearthStonePercent);
        System.out.printf("Fornite - %.2f%%%n", fornitePercent);
        System.out.printf("Overwatch - %.2f%%%n", overWatchPercent);
        System.out.printf("Others - %.2f%%", othersPercent);
    }
}
