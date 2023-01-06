package NestedLoops;

import java.util.Scanner;

public class SecretDoorLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hundreds = Integer.parseInt(scanner.nextLine());
        int dozens = Integer.parseInt(scanner.nextLine());
        int units = Integer.parseInt(scanner.nextLine());

//        boolean even = (hundreds % 2 == 0) & (units % 2 == 0);
//        boolean simpleNumbers = (dozens == 2) || (dozens == 3) || (dozens == 5) || (dozens == 7);

        for (int firstNum = 1; firstNum <= hundreds; firstNum++) {
            for (int secondNum = 1; secondNum <= dozens; secondNum++) {
                for (int thirdNum = 1; thirdNum <= units; thirdNum++) {
                    if ((firstNum % 2 == 0 & thirdNum % 2 == 0) & (secondNum == 2 || secondNum == 3 || secondNum == 5 || secondNum == 7)) {
                        System.out.printf("%d %d %d%n", firstNum, secondNum, thirdNum);
                    }
                }
            }
        }
    }
}
