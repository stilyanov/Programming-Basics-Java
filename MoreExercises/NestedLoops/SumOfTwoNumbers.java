package NestedLoops;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        int combination = 0;
        boolean isFound = false;

        for (int i = startNum; i <= endNum; i++) {
            for (int j = startNum; j <= endNum; j++) {
                combination++;
                if (i + j == magicNum) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", combination, i, j, magicNum);
                    isFound = true;
                    return;
                }
            }
        }
        if (!isFound) {
            System.out.printf("%d combinations - neither equals %d", combination, magicNum);
        }
    }
}
