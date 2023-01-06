package Exercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());//редове
        int colons = Integer.parseInt(scanner.nextLine());//колони
        //•	Premiere – премиерна прожекция, на цена 12.00 лева.
        //•	Normal – стандартна прожекция, на цена 7.50 лева.
        //•	Discount – прожекция за деца, ученици и студенти на намалена цена от 5.00 лева.
        double income = 0;
        switch (projection) {
            case "Premiere":
                income = rows * colons * 12;
                break;
            case "Normal":
                income = rows * colons * 7.50;
                break;
            case "Discount":
                income = rows * colons * 5;
                break;
        }
        System.out.printf("%.2f leva", income);
    }
}
