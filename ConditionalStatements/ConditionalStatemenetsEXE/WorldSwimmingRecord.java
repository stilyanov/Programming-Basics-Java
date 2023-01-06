package ConditionalStatemenetsEXE;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordSeconds = Double.parseDouble(scanner.nextLine());
        double distanceMeters = Double.parseDouble(scanner.nextLine());
        double timeSeconds = Double.parseDouble(scanner.nextLine());

        double result = distanceMeters * timeSeconds;
        double slowDown = Math.floor(distanceMeters / 15) * 12.5;
        double totalTime = result + slowDown;

        if (totalTime < recordSeconds) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTime - recordSeconds);
        }
    }
}
