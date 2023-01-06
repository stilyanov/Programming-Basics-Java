package ForLoopMoreExercises;

import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int hours = 0; hours <= 23; hours++) {
            for (int min = 0; min <= 59; min++) {
                System.out.printf("%d : %d%n", hours, min);
            }
        }
    }
}
