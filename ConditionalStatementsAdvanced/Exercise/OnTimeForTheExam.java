package Exercise;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//  •	Първият ред съдържа час на изпита – цяло число от 0 до 23.
//  •	Вторият ред съдържа минута на изпита – цяло число от 0 до 59.
//  •	Третият ред съдържа час на пристигане – цяло число от 0 до 23.
//  •	Четвъртият ред съдържа минута на пристигане – цяло число от 0 до 59.
        int hourExam = Integer.parseInt(scanner.nextLine());
        int minuteExam = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMinute = Integer.parseInt(scanner.nextLine());

        int totalMin = hourExam * 60 + minuteExam;
        int totalMinArrived = arriveHour * 60 + arriveMinute;
        int difference = totalMin - totalMinArrived;

        if (difference == 0) {
            System.out.printf("On time");
        } else if (difference > 0 && difference <= 30) {
            System.out.printf("On time%n%d minutes before the start", Math.abs(difference));
        } else if (difference < 0) {
            difference = Math.abs(difference);
            System.out.println("Late");
            if (difference >= 60) {
                hourExam = difference / 60;
                minuteExam = difference % 60;
                System.out.printf("%d:%02d hours after the start", hourExam, minuteExam);
            } else {
                System.out.printf("%d minutes after the start", difference);
            }
        } else {
            System.out.println("Early");
            if (difference >= 60) {
                hourExam = difference / 60;
                minuteExam = difference % 60;
                System.out.printf("%d:%02d hours before the start", hourExam, minuteExam);
            } else {
                System.out.printf("%d minutes before the start", difference);
            }
        }
    }
}
