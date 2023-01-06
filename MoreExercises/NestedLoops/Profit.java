package NestedLoops;

import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int coinsBy1 = Integer.parseInt(scanner.nextLine());
        int coinsBy2 = Integer.parseInt(scanner.nextLine());
        int coinsBy5 = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());

        for (int one = 0; one <= coinsBy1; one++) {
            for (int two = 0; two <= coinsBy2; two++) {
                for (int five = 0; five <= coinsBy5; five++) {
                    if ((one * 1) + (two * 2) + (five * 5) == sum) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", one, two, five, sum);
                    }
                }
            }
        }
    }
}
