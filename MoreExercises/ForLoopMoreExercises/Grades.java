package ForLoopMoreExercises;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());

        double poorGrade = 0;
        double middleGrade = 0;
        double goodGrade = 0;
        double excellentGrade = 0;

        double averageGrades = 0;

        for (int grades = 1; grades <= students; grades++) {
            double nextGrade = Double.parseDouble(scanner.nextLine());

            averageGrades += nextGrade;
            if (nextGrade >= 2.00 && nextGrade <= 2.99) {
                poorGrade++;
            } else if (nextGrade >= 3.00 && nextGrade <= 3.99) {
                middleGrade++;
            } else if (nextGrade >= 4.00 && nextGrade <= 4.99) {
                goodGrade++;
            } else {
                excellentGrade++;
            }
        }
        System.out.printf("Top students: %.2f%%%n", excellentGrade / students * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", goodGrade / students * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", middleGrade / students * 100);
        System.out.printf("Fail: %.2f%%%n", poorGrade / students * 100);
        System.out.printf("Average: %.2f", averageGrades / students);
    }
}
