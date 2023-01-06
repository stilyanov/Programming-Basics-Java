import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());
        int allDays = 0;
        int spendDays = 0;

        while (availableMoney < vacationMoney && spendDays < 5) {
            String action = scanner.nextLine();
            double savedSum = Double.parseDouble(scanner.nextLine());

            allDays++;

            if (action.equals("spend")) {
                availableMoney = availableMoney - savedSum;
                spendDays++;
            }
            if (availableMoney < 0) {
                availableMoney = 0;
            }

            if (action.equals("save")) {
                availableMoney = availableMoney + savedSum;
                spendDays = 0;
            }
        }
        if (spendDays == 5) {
            System.out.println("You can't save the money.");
            System.out.println(allDays);
        } else {
            System.out.printf("You saved the money for %d days.", allDays);
        }
    }
}
