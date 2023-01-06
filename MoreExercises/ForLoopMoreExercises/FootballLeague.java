package ForLoopMoreExercises;

import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stadium = Integer.parseInt(scanner.nextLine());
        int fans = Integer.parseInt(scanner.nextLine());

        int sectorA = 0;
        int sectorB = 0;
        int sectorV = 0;
        int sectorG = 0;

        for (int i = 1; i <= fans; i++) {
            String sector = scanner.nextLine();
            if (sector.equals("A")) {
                sectorA++;
            } else if (sector.equals("B")) {
                sectorB++;
            } else if (sector.equals("V")) {
                sectorV++;
            } else if (sector.equals("G")) {
                sectorG++;
            }
        }
        double fansA = sectorA * 1.0 / fans * 100;
        double fansB = sectorB * 1.0 / fans * 100;
        double fansV = sectorV * 1.0 / fans * 100;
        double fansG = sectorG * 1.0 / fans * 100;
        double allFans = fans * 1.0 / stadium * 100;

        System.out.printf("%.2f%%%n", fansA);
        System.out.printf("%.2f%%%n", fansB);
        System.out.printf("%.2f%%%n", fansV);
        System.out.printf("%.2f%%%n", fansG);
        System.out.printf("%.2f%%", allFans);
    }
}
