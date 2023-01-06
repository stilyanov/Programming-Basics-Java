package Exam_March;

import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double totalFood = Double.parseDouble(scanner.nextLine());

        int countDays = 0;
        int totalEatenFoodDog = 0;
        int totalEatenFoodCat = 0;
        double biscuits = 0;

        for (int i = 1; i < days; i++) {
            int eatenFoodByDog = Integer.parseInt(scanner.nextLine());
            int eatenFoodByCat = Integer.parseInt(scanner.nextLine());
            totalEatenFoodDog += eatenFoodByDog;
            totalEatenFoodCat += eatenFoodByCat;


            if (i % 3 == 0) {
                double currentBiscuits = (totalEatenFoodCat + totalEatenFoodDog) * 0.10;
                biscuits += currentBiscuits;
            }
        }
        double allEatenFood = totalEatenFoodDog + totalEatenFoodCat;
        double percentFood = (allEatenFood / totalFood) * 100;
        double percentDog = (totalEatenFoodDog / allEatenFood) * 100;
        double percentCat = (totalEatenFoodCat / allEatenFood) * 100;

        System.out.printf("Total eaten biscuits: %.2fgr.%n", Math.abs(biscuits));
        System.out.printf("%.2f%% of the food has been eaten.%n", percentFood);
        System.out.printf("%.2f%% eaten from the dog.%n", percentDog);
        System.out.printf("%.2f%% eaten from the dog.%n", percentCat);
    }
}
