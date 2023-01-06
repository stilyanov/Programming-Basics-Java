package NestedLoops;

import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= firstNum; i += 2) {
            for (int j = 2; j <= secondNum; j++) {
                for (int k = 2; k <= thirdNum; k += 2) {
                    if (j == 2 || j == 3 || j == 5 || j == 7) {
                        System.out.printf("%d %d %d%n", i, j, k);
                    }
                }
            }
        }
    }
}
