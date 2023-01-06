import java.util.Scanner;

public class ComputerFirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberComputers = Integer.parseInt(scanner.nextLine());

        double possibleSalesWithLastNumber = 0;
        double possibleSalesWithoutLastNumber = 0;
        double salesMade = 0;
        double averageRating = 0;
        double ratingCount = 0;

        for (int i = 1; i <= numberComputers; i++) {
            int rating = Integer.parseInt(scanner.nextLine());
            ratingCount++;

            possibleSalesWithLastNumber = rating % 10;
            possibleSalesWithoutLastNumber = (int) rating / 10;

            if (possibleSalesWithLastNumber == 2) {
                possibleSalesWithoutLastNumber = possibleSalesWithoutLastNumber * 0.0;
            } else if (possibleSalesWithLastNumber == 3) {
                possibleSalesWithoutLastNumber = possibleSalesWithoutLastNumber * 0.50;
            } else if (possibleSalesWithLastNumber == 4) {
                possibleSalesWithoutLastNumber = possibleSalesWithoutLastNumber * 0.70;
            } else if (possibleSalesWithLastNumber == 5) {
                possibleSalesWithoutLastNumber = possibleSalesWithoutLastNumber * 0.85;
            } else if (possibleSalesWithLastNumber == 6) {
                possibleSalesWithoutLastNumber = possibleSalesWithoutLastNumber * 1;
            }
            averageRating += possibleSalesWithLastNumber;
            salesMade += possibleSalesWithoutLastNumber;
        }
        averageRating = averageRating / ratingCount;
        System.out.printf("%.2f%n", salesMade);
        System.out.printf("%.2f%n", averageRating);
    }
}
