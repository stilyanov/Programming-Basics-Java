import java.util.Scanner;

public class FootballKit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double shirt = Double.parseDouble(scanner.nextLine());
        double sumGoal = Double.parseDouble(scanner.nextLine());

        double shorts = shirt * 0.75;
        double socks = shorts * 0.20;
        double trainers = (shirt + shorts) * 2;

        double total = shirt + shorts + socks + trainers;
        double discount = total - (total * 0.15);

        if (discount >= sumGoal) {
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.", discount);
        } else if (discount < sumGoal){
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.", Math.abs(discount - sumGoal));
        }
    }
}
