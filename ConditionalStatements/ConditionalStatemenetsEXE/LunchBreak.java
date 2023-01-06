package ConditionalStatemenetsEXE;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String serial = scanner.nextLine();
        int durationSerial = Integer.parseInt(scanner.nextLine());
        int durationBreak = Integer.parseInt(scanner.nextLine());

        double lunch = durationBreak / 8.0;
        double relax = durationBreak / 4.0;
        double timeLeft = durationBreak - lunch - relax;

        if (timeLeft >= durationSerial) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", serial, Math.ceil(timeLeft - durationSerial));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", serial, Math.ceil(durationSerial - timeLeft));
        }
    }
}
