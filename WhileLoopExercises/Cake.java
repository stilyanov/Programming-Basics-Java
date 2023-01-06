import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int piecesCake = width * length;

        String piece = scanner.nextLine();

        while (!piece.equals("STOP")) {
            int nextPiece = Integer.parseInt(piece);
            piecesCake = piecesCake - nextPiece;
            if (piecesCake <= 0) {
                break;
            }
            piece = scanner.nextLine();
        }
        if (piecesCake < 0) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(piecesCake));
        } else {
            System.out.printf("%d pieces are left.", piecesCake);
        }
    }
}
