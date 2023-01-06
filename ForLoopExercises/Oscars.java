import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int countJury = Integer.parseInt(scanner.nextLine());

        for (int jury = 1; jury <= countJury ; jury++) {
            String juryName = scanner.nextLine();
            double juryPoints = Double.parseDouble(scanner.nextLine());
            double givenPoints = (juryName.length() * juryPoints) / 2;

            academyPoints += givenPoints;

            if (academyPoints >= 1250.5) {
                break;
            }
        }
        if (academyPoints >= 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, academyPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - academyPoints);
        }
    }
}
