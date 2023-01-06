import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int volume = width * length * height;

        String box = scanner.nextLine();

        while (!box.equals("Done")) {
            int nextBox = Integer.parseInt(box);
            volume = volume - nextBox;
            if (volume <= 0) {
                break;
            }
            box = scanner.nextLine();

        }
        if (volume < 0) {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(volume));
        } else {
            System.out.printf("%d Cubic meters left.", Math.abs(volume));
        }
    }
}
