package Exam_March;

import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.	Рекордът в секунди – реално число в интервала [0.00 … 100000.00]
        //2.	Разстоянието в метри – реално число в интервала [0.00 … 100000.00]
        //3.	Времето в секунди, за което изкачва 1 м. – реално число в интервала [0.00 … 1000.00]
        double secondsRecord = Double.parseDouble(scanner.nextLine());
        double distanceMeters = Double.parseDouble(scanner.nextLine());
        double timeInSeconds = Double.parseDouble(scanner.nextLine());

        double climbing = distanceMeters * timeInSeconds;
        double slowingDown = (int) Math.floor(distanceMeters / 50) * 30;
        double totalTime = climbing + slowingDown;

        if (totalTime >= secondsRecord) {
            System.out.printf("No! He was %.2f seconds slower.", totalTime - secondsRecord);
        } else if (totalTime < secondsRecord) {
            System.out.printf("Yes! The new record is %.2f seconds.", totalTime);
        }
    }
}