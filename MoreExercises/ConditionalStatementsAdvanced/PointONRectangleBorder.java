package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class PointONRectangleBorder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//      x1, y1, x2, y2, x и y (като се гарантира, че x1 < x2 и y1 < y2).

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());

        if (x > x1 && x < x2) {

        } else if (y > y1 && y < y2) {

        }
    }
}
