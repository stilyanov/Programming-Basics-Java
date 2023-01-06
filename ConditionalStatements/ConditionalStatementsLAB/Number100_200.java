package ConditionalStatementsLAB;

import java.util.Scanner;

public class Number100_200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String text = "";

        if (number < 100) {
            text = "Less than 100";
        } else if (number <= 200) {
            text = "Between 100 and 200";
        } else {
            text = "Greater than 200";
        }
        System.out.println(text);
    }
}
