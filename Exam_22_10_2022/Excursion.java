import java.util.Scanner;

public class Excursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Нощувка - 20 лв.
        //•	Карта за транспорт - 1.60 лв.
        //•	Билет за музей - 6 лв.

        int people = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        int cards = Integer.parseInt(scanner.nextLine());
        int museumTickets = Integer.parseInt(scanner.nextLine());

        int nightsPrice = nights * 20;
        double transportCards = cards * 1.60;
        int museumPrice = museumTickets * 6;

        double total = nightsPrice + transportCards + museumPrice;
        double totalCount = total * people;

        double expenses = totalCount + (totalCount * 0.25);
        System.out.printf("%.2f", expenses);
    }
}
