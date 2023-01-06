package NestedLoops;

import java.util.Scanner;

public class PrimePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstStart = Integer.parseInt(scanner.nextLine());
        int secondStart = Integer.parseInt(scanner.nextLine());
        int diffFirst = Integer.parseInt(scanner.nextLine());
        int diffSecond = Integer.parseInt(scanner.nextLine());

        int firstEnd = firstStart + diffFirst;
        int secondEnd = secondStart + diffSecond;

        int pair1 = 0;
        int pair2 = 0;

        for (int i = firstStart; i <= firstEnd; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    pair1++;
                }
            }
            if (pair1 == 2) {
                for (int k = secondStart; k <= secondEnd; k++) {
                    for (int l = 1; l <= k; l++) {
                        if (k % l == 0) {
                            pair2++;
                        }
                    }
                    if (pair2 == 2) {
                        System.out.printf("%d%d%n", i, k);
                    } else {
                        pair2 = 0;
                    }
                }
            } else {
                pair2 = 0;
            }
        }
    }
}
