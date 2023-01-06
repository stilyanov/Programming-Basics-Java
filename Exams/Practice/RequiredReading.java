package Exercises3;

import java.util.Scanner;

public class RequiredReading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pages = Integer.parseInt(scanner.nextLine());
        int pagesByHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int totalTime = pages / pagesByHour;
        int total = totalTime / days;

        System.out.println(total);

    }
}
