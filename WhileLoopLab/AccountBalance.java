import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double total = 0;

        while (!input.equals("NoMoreMoney")) {
            double numbers = Double.parseDouble(input);
            if (numbers < 0) {
                System.out.printf("Invalid operation!%n");
                break;
            }
            total = total + numbers;
            System.out.printf("Increase: %.2f%n", numbers);
            input = scanner.nextLine();

        }
        System.out.printf("Total: %.2f", total);
    }
}
