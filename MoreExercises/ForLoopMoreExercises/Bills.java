package ForLoopMoreExercises;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());

        double electricity = 0;
        double water = 20;
        double internet = 15;
        double others = 0;
        double average = 0;
        double totalElectricity = 0;
        double othersTotal = 0;
        double total = 0;
        for (int everyMonth = 1; everyMonth <= months; everyMonth++) {
            double electricityBill = Double.parseDouble(scanner.nextLine());
            electricity += electricityBill;

            others = (electricityBill + 20 + 15);
            othersTotal = others + (others * 0.20);
            total += othersTotal;
        }
        water *= months;
        internet *= months;
        average = (electricity + water + internet + total) / months;
        System.out.printf("Electricity: %.2f lv%n", electricity);
        System.out.printf("Water: %.2f lv%n", water);
        System.out.printf("Internet: %.2f lv%n", internet);
        System.out.printf("Other: %.2f lv%n", total);
        System.out.printf("Average: %.2f lv", average);
    }
}
