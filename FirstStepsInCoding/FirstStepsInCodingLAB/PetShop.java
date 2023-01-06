package FirstStepsInCodingLAB;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogFood = Integer.parseInt(scanner.nextLine());
        int catFood = Integer.parseInt(scanner.nextLine());

        double dogPrice = dogFood * 2.50;
        double catPrice = catFood * 4;
        double result = dogPrice + catPrice;

        System.out.printf("%f lv.", result);

    }
}
