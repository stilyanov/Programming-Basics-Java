package Exercises3;

import java.util.Scanner;

public class Aquarium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int high = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int volume = length * width * high;
        double volumeLiters = volume * 0.001;
        double requiredLiters = volumeLiters * (1 - percent / 100);

        System.out.println(requiredLiters);
    }
}
