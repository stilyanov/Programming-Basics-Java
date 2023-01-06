package FirstStepsInCodingEXE;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int detergent = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double pensPrice = pens * 5.80;
        double markersPrice = markers * 7.20;
        double detergentPrice = detergent * 1.20;

        double totalPrice = pensPrice + markersPrice + detergentPrice;
        double discount = totalPrice - (totalPrice * percent / 100);

        System.out.println(discount);
    }
}
