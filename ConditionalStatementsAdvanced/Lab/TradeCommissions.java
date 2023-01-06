package Lab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine()); // обем на продажбите
        double commission = 0;
        boolean isValidData = true;

        if (sales >= 0 && sales <= 500) {
            if (city.equals("Sofia")) {
                commission = 0.05;
            } else if (city.equals("Varna")) {
                commission = 0.045;
            } else if (city.equals("Plovdiv")) {
                commission = 0.055;
            } else {
                isValidData = false;
            }
        } else if (sales > 500 && sales <= 1000) {
            if (city.equals("Sofia")) {
                commission = 0.07;
            } else if (city.equals("Varna")) {
                commission = 0.075;
            } else if (city.equals("Plovdiv")) {
                commission = 0.08;
            } else {
                isValidData = false;
            }
        } else if (sales > 1000 && sales <= 10000) {
            if (city.equals("Sofia")) {
                commission = 0.08;
            } else if (city.equals("Varna")) {
                commission = 0.10;
            } else if (city.equals("Plovdiv")) {
                commission = 0.12;
            } else {
                isValidData = false;
            }
        } else if (sales > 10000) {
            if (city.equals("Sofia")) {
                commission = 0.12;
            } else if (city.equals("Varna")) {
                commission = 0.13;
            } else if (city.equals("Plovdiv")) {
                commission = 0.145;
            } else {
                isValidData = false;
            }
        } else {
            isValidData = false;
        }
        double total = sales * commission;
        if (!isValidData) {
            System.out.println("error");
        } else System.out.printf("%.2f", total);
    }
}
