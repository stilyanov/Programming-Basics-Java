package WhileLoopMoreExercises;

import java.util.Scanner;

public class DishWasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int detergent = Integer.parseInt(scanner.nextLine());
        String text = scanner.nextLine();
        detergent *= 750;
        int dishesCount = 0;
        int numberDishes = 0;
        int numberPots = 0;

        while (!text.equals("End")) {
            int nextDish = Integer.parseInt(text);
            dishesCount++;

            if (dishesCount % 3 == 0) {
                numberPots += nextDish;
                nextDish *= 15;
            } else {
                numberDishes += nextDish;
                nextDish = nextDish * 5;
            }
            detergent -= nextDish;

            if (detergent < 0) {
                break;
            }

            text = scanner.nextLine();
        }

        if (text.equals("End")) {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", numberDishes, numberPots);
            System.out.printf("Leftover detergent %d ml.", detergent);
        } else if (detergent < 0){
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(detergent));
        }
    }
}


