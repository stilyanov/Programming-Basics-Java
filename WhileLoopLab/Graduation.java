import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        double totalGrade = 0;
        int poorGrade = 0;
        int years = 1;

        while (years <= 12) {
            if (poorGrade > 1) {
                break;
            }
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 4) {
                poorGrade++;
                continue;
            }
            totalGrade = totalGrade + grade;
            years++;
        }
        double averageGrade = totalGrade / 12;
        if (poorGrade > 1) {
            System.out.printf("%s has been excluded at %d grade", name, years);
        } else {
            System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade);
        }
    }
}
