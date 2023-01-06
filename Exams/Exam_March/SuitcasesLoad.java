package Exam_March;

import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double volumeCapacity = Double.parseDouble(scanner.nextLine());

        String volumeSuitCase = scanner.nextLine();

        int countSuitCase = 0;

        while (!volumeSuitCase.equals("End")) {
            double nextSuitCase = Double.parseDouble(volumeSuitCase);

            countSuitCase++;

            if (countSuitCase == 3) {
                nextSuitCase = (nextSuitCase * 0.1) + nextSuitCase;
            }

            volumeCapacity -= nextSuitCase;
            if (volumeCapacity < 0) {
                countSuitCase--;
                break;
            }

            volumeSuitCase = scanner.nextLine();
        }
        if (volumeSuitCase.equals("End")) {
            System.out.println("Congratulations! All suitcases are loaded!");
        } else {
            System.out.println("No more space!");
        }
        System.out.printf("Statistic: %d suitcases loaded.", countSuitCase);
    }
}
