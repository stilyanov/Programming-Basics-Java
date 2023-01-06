import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        int allCountTickets = 0;
        int studentCount = 0;
        int standardCount = 0;
        int kidsCount = 0;

        while (!text.equals("Finish")) {
            String movieName = text;
            int freeSpace = Integer.parseInt(scanner.nextLine());
            int countTickets = 0;

            String input = scanner.nextLine();
            while (!input.equals("End")) {
                String typeTicket = input;

                allCountTickets++;
                countTickets++;

                switch (typeTicket) {
                    case "student":
                        studentCount++;
                        break;
                    case "standard":
                        standardCount++;
                        break;
                    case "kid":
                        kidsCount++;
                        break;
                }
                if (freeSpace == countTickets) {
                    break;
                }
                input = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movieName, countTickets * 100.0 / freeSpace);
            text = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", allCountTickets);
        System.out.printf("%.2f%% student tickets.%n", studentCount * 100.0 / allCountTickets);
        System.out.printf("%.2f%% standard tickets.%n", standardCount * 100.0 / allCountTickets);
        System.out.printf("%.2f%% kids tickets.%n", kidsCount * 100.0 / allCountTickets);
    }
}
