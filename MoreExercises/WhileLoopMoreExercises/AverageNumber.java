package WhileLoopMoreExercises;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        double total = 0;
        for (int i = 1; i <= number; i++) {
            int nextNum = Integer.parseInt(scanner.nextLine());

            total += nextNum;
        }
        System.out.printf("%.2f", total / number);;
    }
}
