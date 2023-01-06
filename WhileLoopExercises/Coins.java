import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double changeLeva = Double.parseDouble(scanner.nextLine());
        double changeCoins = Math.round(changeLeva * 100);
        int coinsCount = 0;

        while (changeCoins > 0) {
            if (changeCoins >= 200) {
                changeCoins = changeCoins - 200;
                coinsCount++;
            } else if (changeCoins >= 100) {
                changeCoins = changeCoins - 100;
                coinsCount++;
            } else if (changeCoins >= 50) {
                changeCoins = changeCoins - 50;
                coinsCount++;
            } else if (changeCoins >= 20) {
                changeCoins = changeCoins - 20;
                coinsCount++;
            } else if (changeCoins >= 10) {
                changeCoins = changeCoins - 10;
                coinsCount++;
            } else if (changeCoins >= 5) {
                changeCoins = changeCoins - 5;
                coinsCount++;
            } else if (changeCoins >= 2) {
                changeCoins = changeCoins - 2;
                coinsCount++;
            } else if (changeCoins >= 1) {
                changeCoins = changeCoins - 1;
                coinsCount++;
            }
        }
        System.out.println(coinsCount);
    }
}
