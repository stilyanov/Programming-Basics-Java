package FirstStepsInCodingEXE;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pages = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int totalHours = pages / hours;
        int hoursByDay = totalHours / days;

        System.out.println(hoursByDay);
    }
}
