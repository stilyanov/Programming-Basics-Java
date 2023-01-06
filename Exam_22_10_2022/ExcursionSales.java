import java.util.Scanner;

public class ExcursionSales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tourSea = Integer.parseInt(scanner.nextLine());
        int tourMountain = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        while (true) {
            String nextInput = scanner.nextLine();

            if (nextInput.equals("Stop")) {
                System.out.println("Good job! Everything is sold.");
                break;
            }

            if (nextInput.equals("sea") && tourSea != 0) {
                totalPrice = totalPrice + 680;
                tourSea--;
            } else if (nextInput.equals("mountain") && tourMountain != 0) {
                totalPrice = tourMountain + 499;
                tourMountain--;
            }
            if (tourSea == 0) {
                break;
            }
            if (tourMountain ==0) {
                break;
            }
                nextInput = scanner.nextLine();
            }
        System.out.printf("Profit: %.2f leva.", totalPrice);
        }
    }
