package Exam_March;

import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutes = Integer.parseInt(scanner.nextLine());
        int walks = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());

        int totalMinutes = minutes * walks;
        int totalCalories = totalMinutes * 5;
        double percent = calories * 0.50;

        if (totalCalories >= percent) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", totalCalories);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d." , totalCalories);
        }
    }
}
