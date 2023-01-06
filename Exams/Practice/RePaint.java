package Practice;

import java.util.Scanner;

public class RePaint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int litersPaint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double nylonPrice = (nylon + 2) * 1.50;
        double paint = (litersPaint + litersPaint * 10 / 100.00) * 14.50;
        double thinnerPrice = thinner * 5.00;

        double materials = nylonPrice + paint + thinnerPrice + 0.40;
        double workersPrice = (materials * 30 / 100) * hours;
        double total = materials + workersPrice;

        System.out.println(total);

    }
}
