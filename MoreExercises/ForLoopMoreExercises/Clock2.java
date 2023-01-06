package ForLoopMoreExercises;

import java.util.Scanner;

public class Clock2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int hours = 0; hours <= 23; hours++) {
            for (int min = 0; min <= 59; min++) {
                for (int sec = 0; sec <= 59; sec++) {
                    System.out.printf("%d : %d : %d%n", hours, min, sec);
                }
            }
        }
    }
}
