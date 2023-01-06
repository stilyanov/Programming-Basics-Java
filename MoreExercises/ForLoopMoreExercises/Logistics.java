package ForLoopMoreExercises;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countLoads = Integer.parseInt(scanner.nextLine());

        int sumTons = 0;
        double microBus = 0;
        double truck = 0;
        double train = 0;

        for (int i = 1; i <= countLoads; i++) {
            int tons = Integer.parseInt(scanner.nextLine());

            if (tons <= 3) {
                microBus = microBus + tons;
            } else if (tons >= 4 && tons <= 11) {
                truck = truck + tons;
            } else if (tons >= 12) {
                train = train + tons;
            }
            sumTons = sumTons + tons;
        }
        double microBusPrice = microBus * 200;
        double truckPrice = truck * 175;
        double trainPrice = train * 120;

        double totalPrice = microBusPrice + truckPrice + trainPrice;

        System.out.printf("%.2f%n", totalPrice / sumTons);
        System.out.printf("%.2f%%%n", microBus / sumTons * 100);
        System.out.printf("%.2f%%%n", truck / sumTons * 100);
        System.out.printf("%.2f%%%n", train / sumTons * 100);
    }
}
