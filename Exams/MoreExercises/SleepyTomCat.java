package MoreExercises;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int weekends = Integer.parseInt(scanner.nextLine());

        int workdaysPlay = 365 - weekends;
        int weekendsPlay = weekends * 127;
        int workdaysPlay2 = workdaysPlay * 63;
        int yearPlay = 30000;
        int totalTimePlay = workdaysPlay2 + weekendsPlay;
        int difference = Math.abs(totalTimePlay - yearPlay);
        int hours = difference / 60;
        int minutes = difference % 60;


        if (yearPlay > totalTimePlay) {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", hours, minutes);

        } else {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hours, minutes);
        }
    }
}
