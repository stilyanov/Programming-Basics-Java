package Exam_July_2020;

import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startRange = Integer.parseInt(scanner.nextLine());
        int endRange = Integer.parseInt(scanner.nextLine());

        int firstStart = startRange / 1000;
        int secondStart = (startRange / 100) % 10;
        int thirdStart = (startRange / 10) % 10;
        int fourthStart = startRange % 10;

        int firstEnd = endRange / 1000;
        int secondEnd = (endRange / 100) % 10;
        int thirdEnd = (endRange / 10) % 10;
        int fourthEnd = endRange % 10;

        for (int firstNum = firstStart; firstNum <= firstEnd; firstNum++) {
            for (int secondNum = secondStart; secondNum <= secondEnd; secondNum++) {
                for (int thirdNum = thirdStart; thirdNum <= thirdEnd; thirdNum++) {
                    for (int fourthNum = fourthStart; fourthNum <= fourthEnd; fourthNum++) {
                        if (firstNum % 2 != 0 && secondNum % 2 != 0 && thirdNum % 2 != 0 && fourthNum % 2 != 0) {
                            System.out.printf("%d%d%d%d ", firstNum, secondNum, thirdNum, fourthNum);
                        }
                    }
                }
            }
        }
    }
}
