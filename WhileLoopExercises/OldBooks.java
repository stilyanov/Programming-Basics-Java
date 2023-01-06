import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String searchedBook = scanner.nextLine();
        int countBooks = 0;
        String nextBook = scanner.nextLine();

        while (!nextBook.equals("No More Books")) {

            if (searchedBook.equals(nextBook)) {
                break;
            }
            countBooks++;

            nextBook = scanner.nextLine();
        }
        if (nextBook.equals(searchedBook)) {
            System.out.printf("You checked %d books and found it.", countBooks);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", countBooks);
        }
    }
}
