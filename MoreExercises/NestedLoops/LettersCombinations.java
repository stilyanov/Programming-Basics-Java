package NestedLoops;

import java.util.Scanner;

public class LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstWord = scanner.nextLine().charAt(0);
        char secondWord = scanner.nextLine().charAt(0);
        char thirdWord = scanner.nextLine().charAt(0);

        int counter = 0;

        for (char i = firstWord; i <= secondWord; i++) {
            for (char j = firstWord; j <= secondWord; j++) {
                for (char k = firstWord; k <= secondWord; k++) {
                    if (i != thirdWord && j != thirdWord && k != thirdWord) {
                        System.out.printf("%c%c%c ", i, j, k);
                        counter++;
                    }
                }
            }
        }
        System.out.println(counter + " ");
    }
}
