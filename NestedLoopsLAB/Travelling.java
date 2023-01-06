import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String destination = input;
            double budget = Double.parseDouble(scanner.nextLine());

            double savings = 0;

            while (savings < budget) {
                double amount = Double.parseDouble(scanner.nextLine());
                savings = savings + amount;
            }

            System.out.printf("Going to %s!%n", destination);
            input = scanner.nextLine();
        }
    }
}
