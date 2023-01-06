import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int total = 0;

        for (int i = 1; i <= number; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            total += num;
            if (num > maxNum) {
                maxNum = num;
            }
        }
        int sumWithoutMaxNum = total - maxNum;
        if (maxNum == sumWithoutMaxNum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", maxNum);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(maxNum - sumWithoutMaxNum));
        }
    }
}
