import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String passWord = scanner.nextLine();

        while (true) {
            String input = scanner.nextLine();
             if (input.equals(passWord)) {
                    break;
             }
        }

        System.out.printf("Welcome %s!", userName);
    }
}
