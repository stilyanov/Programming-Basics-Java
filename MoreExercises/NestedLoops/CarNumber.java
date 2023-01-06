package NestedLoops;

import java.util.Scanner;

public class CarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int first = start; first <= end; first++) {
            for (int second = start; second <= end; second++) {
                for (int third = start; third <= end; third++) {
                    for (int fourth = start; fourth <= end; fourth++) {

                        boolean isEvenFirst = first % 2 == 0;
                        boolean isOddFirst = first % 2 != 0;
                        boolean isEvenFourth = fourth % 2 == 0;
                        boolean isOddFourth = fourth % 2 != 0;
                        boolean isBigger = first > fourth;
                        boolean evenSum = (second + third) % 2 == 0;

                        if ((isEvenFirst && isOddFourth) || (isOddFirst && isEvenFourth)) {
                            if (isBigger && evenSum) {
                                System.out.printf("%d%d%d%d ", first, second, third, fourth);
                            }
                        }
                    }
                }
            }
        }
    }
}
