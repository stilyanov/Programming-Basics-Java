package ForLoopMoreExercises;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int value = 0;
        int diff = 0;
        int lastValue = 0;

        for (int i = 1; i <= n; i++) {
            int firstNum = Integer.parseInt(scanner.nextLine());
            int secondNum = Integer.parseInt(scanner.nextLine());

            value = firstNum + secondNum;

            if (i > 0) {
                diff = Math.abs(lastValue - value);
            }
            lastValue = value;
        }
        if (diff == 0) {
            System.out.printf("Yes, value=%s", lastValue);
        } else {
            System.out.printf("No, maxdiff=%s", diff);
        }
    }
}
