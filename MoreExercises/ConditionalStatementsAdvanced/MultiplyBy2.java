package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numbers = Double.parseDouble(scanner.nextLine());
        double total = 0;
        numbers *= 2;
        System.out.printf("Result: %.2f%n", numbers);
        for (int i = 0; i <= numbers; i++) {
            double positiveNumbers = Double.parseDouble(scanner.nextLine());

            if (positiveNumbers >= i) {
                total = positiveNumbers * 2;
                System.out.printf("Result: %.2f%n", total);
            } else {
                System.out.println("Negative number!");
            }
        }
    }
}
