import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int leftSum = 0;

        for (int i = 1; i <= number; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());

            leftSum += currentNumber;
        }

        int rightSum = 0;

        for (int i = 1; i <= number ; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());

            rightSum += currentNumber;
        }

        if (leftSum == rightSum) {
            System.out.printf("Yes, sum = %d", leftSum);
        } else {
            int diff = Math.abs(leftSum - rightSum);
            System.out.printf("No, diff = %d", diff);
        }
    }
}
