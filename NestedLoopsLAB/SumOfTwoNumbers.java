import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int combination = 0;
        boolean isValid = false;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                combination++;
                int total = i + j;
                if (total == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", combination, i, j, total);
                    isValid = true;
                }
            }
            if (isValid) {
                break;
            }
        }

        if (!isValid) {
            System.out.printf("%d combinations - neither equals %d", combination, magicNumber);
        }

    }
}
