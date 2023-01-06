package WhileLoopMoreExercises;

import java.util.Scanner;

public class NumDividedBy3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int num = 1; num <= 100; num++) {
            if (num % 3 == 0) {
                System.out.println(num);
            }
        }
    }
}
