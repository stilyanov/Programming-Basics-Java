package Exam_July_2019;

import com.sun.source.tree.WhileLoopTree;

import java.util.Locale;
import java.util.Scanner;

public class TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nextWord = scanner.nextLine();

        double mostPower = 0;
        String mostPowerfulWord = "";

        while (!nextWord.equals("End of words")) {
            double sum = 0;

            for (int i = 0; i <= nextWord.length(); i++) {
                sum = sum + nextWord.charAt(i);
            }

            int length = nextWord.length();
            String firstLetter = nextWord.toLowerCase();
            if (firstLetter.equals("a") || firstLetter.equals("e") || firstLetter.equals("i") || firstLetter.equals("o") || firstLetter.equals("u") || firstLetter.equals("y")) {
            sum = sum * length;
            } else {
                sum = Math.floor(sum / length);
            }

            if (sum > mostPower) {
                mostPower = sum;
                mostPowerfulWord = nextWord;
            }

            nextWord = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %.0f", mostPowerfulWord, mostPower);
    }
}
