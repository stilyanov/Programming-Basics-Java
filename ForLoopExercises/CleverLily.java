import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int countToys = 0;
        int savedMoney = 0;
        int giftMoney = 0;

        for (int birthdays = 1; birthdays <= age; birthdays++) {
            if (birthdays % 2 == 0) {
                giftMoney += 10;
                savedMoney += giftMoney - 1;
            } else {
                countToys++;
            }
        }
        double total = (toyPrice * countToys) + savedMoney;

        if (total >= washingMachinePrice) {
            System.out.printf("Yes! %.2f", total - washingMachinePrice);
        } else {
            System.out.printf("No! %.2f", washingMachinePrice - total);
        }
    }
}
