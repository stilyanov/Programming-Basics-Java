import java.util.Scanner;

public class Substitute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = Integer.parseInt(scanner.nextLine());
        int L = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int N = Integer.parseInt(scanner.nextLine());

        int counter = 0;


        for (int firstNum = K; firstNum <= 8; firstNum++) {
            for (int secondNum = 9; secondNum >= L; secondNum--) {
                for (int thirdNum = M; thirdNum <= 8; thirdNum++) {
                    for (int forthNum = 9; forthNum >= N; forthNum--) {
                        boolean isValid = firstNum % 2 == 0 && thirdNum % 2 == 0 && secondNum % 2 != 0 && forthNum % 2 != 0;

                        int first = firstNum * 10 + secondNum;
                        int second = thirdNum * 10 + forthNum;
                        if (isValid && first == second) {
                            System.out.println("Cannot change the same player.");
                        } else if (isValid && first != second) {
                            System.out.printf("%d%d - %d%d%n", firstNum, secondNum, thirdNum, forthNum);
                            counter++;
                            if (counter >= 6) {
                                break;
                            }
                        }
                        if (counter >= 6) {
                            break;
                        }
                    }
                    if (counter >= 6) {
                        break;
                    }
                }
                if (counter >= 6) {
                    break;
                }
            }
            if (counter >= 6) {
                break;
            }
        }
    }
}
