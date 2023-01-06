import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int currentNum = 1;
        for (int rows = 1; rows <= number; rows++) {
            for (int colons = 1; colons <= rows; colons++) {
                System.out.print(currentNum + " ");
                currentNum++;
                if (currentNum > number) {
                    break;
                }
            }
            if (currentNum > number) {
                break;
            }
            System.out.println();
        }
    }
}
