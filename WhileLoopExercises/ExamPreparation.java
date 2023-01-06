import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int badGrades = Integer.parseInt(scanner.nextLine());

        double averageGrade = 0;
        int allTasks = 0;
        int unSatisfyGrade = 0;
        String lastTask = "";
        String task = scanner.nextLine();

        while (!task.equals("Enough")) {
            int grades = Integer.parseInt(scanner.nextLine());

            allTasks++;
            averageGrade = averageGrade + grades;

            if (grades <= 4) {
                unSatisfyGrade++;
                badGrades--;
            }
            if (badGrades == 0) {
                break;
            }

            lastTask = task;
            task = scanner.nextLine();
        }
        if (task.equals("Enough")) {
            System.out.printf("Average score: %.2f%n", averageGrade / allTasks);
            System.out.printf("Number of problems: %d%n", allTasks);
            System.out.printf("Last problem: %s", lastTask);
        } else {
            System.out.printf("You need a break, %d poor grades.", unSatisfyGrade);
        }
    }
}
