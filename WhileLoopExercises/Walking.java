import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goal = 10000;
        int totalSteps = 0;

        while (totalSteps < goal) {
            String input = scanner.nextLine();

            if (input.equals("Going home")) {
                int wayHome = Integer.parseInt(scanner.nextLine());
                totalSteps = totalSteps + wayHome;
                break;
            } else {
                int current = Integer.parseInt(input);
                totalSteps = totalSteps + current;
            }
        }
        if (totalSteps >= goal) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", totalSteps - goal);
        } else {
            System.out.printf("%d more steps to reach goal.", goal - totalSteps);
        }
    }
}
