import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int total = 0;
        for (int i = 1; i <= number; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            total += currentNum;
        }
        System.out.println(total);
    }
}
