package Exercises3;

import java.util.Scanner;

public class BasketBallEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearTax = Integer.parseInt(scanner.nextLine());

        double snickers = yearTax - (yearTax * 40 / 100.00);
        double clothes = snickers - (snickers * 20 / 100.00);
        double ball = clothes / 4;
        double accessories = ball / 5;

        double total = yearTax + snickers + clothes + ball + accessories;

        System.out.println(total);

    }
}
