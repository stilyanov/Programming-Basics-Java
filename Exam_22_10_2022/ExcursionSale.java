import java.util.Scanner;

public class ExcursionSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tourSea = Integer.parseInt(scanner.nextLine());
        int tourMountain = Integer.parseInt(scanner.nextLine());

        int totalPrice = 0;

        String inputLine = scanner.nextLine();

        while (!inputLine.equals("Stop")) {
            String nextInput = inputLine;

            if (inputLine.equals("sea") && tourSea != 0) {
                tourSea--;
                totalPrice += 680;
            } else if (inputLine.equals("mountain") && tourMountain != 0) {
                tourMountain--;
                totalPrice += 499;
            }

            if (tourSea == 0 && tourMountain == 0) {
                break;
            }

            inputLine = scanner.nextLine();
        }
        if (tourSea == 0 && tourMountain == 0) {
            System.out.println("Good job! Everything is sold.");
        }
        System.out.printf("Profit: %d leva.", totalPrice);
    }
}
