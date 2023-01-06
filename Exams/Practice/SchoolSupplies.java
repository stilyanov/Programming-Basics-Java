package Exercises3;

import java.util.Scanner;

public class SchoolSupplies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pencils = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int cleaner = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double pencilsPrice = pencils * 5.80;
        double markersPrice = markers * 7.20;
        double cleanerPrice = cleaner * 1.20;

        double price = pencilsPrice + markersPrice + cleanerPrice;
        double total = price - (price * percent / 100);

        System.out.println(total);

    }
}
