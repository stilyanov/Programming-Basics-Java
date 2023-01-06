import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());
        int firstGroup = 0;
        int secondGroup = 0;
        int thirdGroup = 0;
        int forthGroup = 0;
        int fifthGroup = 0;
        for (int i = 1; i <= groups; i++) {
            int peopleInGroups = Integer.parseInt(scanner.nextLine());

            if (peopleInGroups <= 5) {
                firstGroup += peopleInGroups;
            } else if (peopleInGroups >= 6 && peopleInGroups <= 12) {
                secondGroup += peopleInGroups;
            } else if (peopleInGroups >= 13 && peopleInGroups <= 25) {
                thirdGroup += peopleInGroups;
            } else if (peopleInGroups >= 26 && peopleInGroups <= 40) {
                forthGroup += peopleInGroups;
            } else if (peopleInGroups >= 41) {
                fifthGroup += peopleInGroups;
            }
        }
        int totalPeople = fifthGroup + secondGroup + thirdGroup + forthGroup + firstGroup;

        double group1 = firstGroup * 1.0 / totalPeople * 100;
        double group2 = secondGroup * 1.0 / totalPeople * 100;
        double group3 = thirdGroup * 1.0 / totalPeople * 100;
        double group4 = forthGroup * 1.0 / totalPeople * 100;
        double group5 = fifthGroup * 1.0 / totalPeople * 100;

        System.out.printf("%.2f%%%n", group1);
        System.out.printf("%.2f%%%n", group2);
        System.out.printf("%.2f%%%n", group3);
        System.out.printf("%.2f%%%n", group4);
        System.out.printf("%.2f%%%n", group5);
    }
}
