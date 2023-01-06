import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int MaxNum = Integer.MIN_VALUE;

        while (!input.equals("Stop")) {
            int numbers = Integer.parseInt(input);

            if (numbers > MaxNum) {
                MaxNum = numbers;
            }

            input = scanner.nextLine();
        }
        System.out.println(MaxNum);
    }
}
