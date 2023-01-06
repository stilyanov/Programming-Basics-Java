package Exam_March;

import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int foodKG = Integer.parseInt(scanner.nextLine());
        int foodKGtoGR = foodKG * 1000;
        int totalFood = 0;
        String foodPerMeal = scanner.nextLine();

        while (!foodPerMeal.equals("Adopted")) {
            int food = Integer.parseInt(foodPerMeal);
            totalFood += food;
            foodPerMeal = scanner.nextLine();
        }
        if (totalFood > foodKGtoGR) {
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs(totalFood - foodKGtoGR));

        } else  {
            System.out.printf("Food is enough! Leftovers: %d grams.", Math.abs(foodKGtoGR - totalFood));
        }
    }
}
