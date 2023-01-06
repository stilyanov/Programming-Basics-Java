package Exam_March;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());

        int musala = 0;
        int monblan = 0;
        int kilimandjaro = 0;
        int k2 = 0;
        int everest = 0;

        for (int i = 1; i <= groups; i++) {
            int people = Integer.parseInt(scanner.nextLine());

            if (people <= 5) {
                musala = musala + people;
            } else if (people >= 6 && people <= 12) {
                monblan = monblan + people;
            } else if (people >= 13 && people <= 25) {
                kilimandjaro = kilimandjaro + people;
            } else if (people >= 26 && people <= 40) {
                k2 = k2 + people;
            } else if (people >= 41) {
                everest = everest + people;
            }
        }
        int totalPeople = musala + monblan + kilimandjaro + k2 + everest;

        double group1 = musala * 1.0 / totalPeople * 100;
        double group2 = monblan * 1.0 / totalPeople * 100;
        double group3 = kilimandjaro * 1.0 / totalPeople * 100;
        double group4 = k2 * 1.0 / totalPeople * 100;
        double group5 = everest * 1.0 / totalPeople * 100;

        System.out.printf("%.2f%%%n", group1);
        System.out.printf("%.2f%%%n", group2);
        System.out.printf("%.2f%%%n", group3);
        System.out.printf("%.2f%%%n", group4);
        System.out.printf("%.2f%%%n", group5);
    }
}
