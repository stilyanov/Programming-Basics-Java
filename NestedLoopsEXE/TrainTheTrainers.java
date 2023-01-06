import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jury = Integer.parseInt(scanner.nextLine());

        String text = scanner.nextLine();
        double sumGrades = 0;
        int presentationCount = 0;

        while (!text.equals("Finish")) {
            String presentation = text;
            presentationCount++;
            double gradeSum = 0;
            double averageGrade = 0;

            for (int i = 1; i <= jury; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                gradeSum = gradeSum + grade;
            }
            averageGrade = gradeSum / jury;
            sumGrades = sumGrades + averageGrade;

            System.out.printf("%s - %.2f.%n", presentation, averageGrade);

            text = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", sumGrades / presentationCount);
    }
}
