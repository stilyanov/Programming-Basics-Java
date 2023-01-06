package Exam_July_2019;

import java.util.Scanner;

public class Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int heightWall = Integer.parseInt(scanner.nextLine());
        int widthWall = Integer.parseInt(scanner.nextLine());
        int percentNotPainted = Integer.parseInt(scanner.nextLine());

        int area = heightWall * widthWall * 4;
        double total = Math.ceil(area - (area * percentNotPainted / 100.0));

        String input = scanner.nextLine();
        while (!input.equals("Tired!")) {
            int nextPaint = Integer.parseInt(input);
            total = total - nextPaint;

            if (total <= 0) {
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("Tired!")) {
            System.out.printf("%.0f quadratic m left.", total);
        } else if (total < 0) {
            System.out.printf("All walls are painted and you have %d l paint left!", (int) Math.abs(total));
        } else {
            System.out.println("All walls are painted! Great job, Pesho!");
        }
    }
}
