package Exercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double studio = 0;
        double apartment = 0;

        switch (month) {
            case "May":
            case "October":
                studio = 50 * nights;
                apartment = 65 * nights;
                if (nights > 14) {
                    studio = studio - (studio * 0.30);
                    apartment = apartment - (apartment * 0.10);
                } else if (nights > 7) {
                    studio = studio - (studio * 0.05);
                }
                break;
            case "June":
            case "September":
                studio = 75.20 * nights;
                apartment = 68.70 * nights;
                if (nights > 14) {
                    studio = studio - (studio * 0.20);
                    apartment = apartment - (apartment * 0.10);
                }
                break;
            case "July":
            case "August":
                studio = 76 * nights;
                apartment = 77 * nights;
                if (nights > 14) {
                    apartment = apartment - (apartment * 0.10);
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.%n", apartment);
        System.out.printf("Studio: %.2f lv.", studio);
    }
}
