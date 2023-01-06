package WhileLoopMoreExercises;

import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = "";
        boolean cRepeated = false;
        boolean oRepeated = false;
        boolean nRepeated = false;

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            char symbol = input.charAt(0);
            if ((symbol >= 'a' && symbol <= 'z') ||  (symbol >= 'A' && symbol <= 'Z')) {
                switch (input) {
                    case "c":
                        if (cRepeated) {
                            word = word + input;
                        }
                        cRepeated = true;
                        break;
                    case "o":
                        if (oRepeated) {
                            word = word + input;
                        }
                        oRepeated = true;
                        break;
                    case "n":
                        if (nRepeated) {
                            word = word + input;
                        }
                        nRepeated = true;
                        break;
                    default:
                        word = word + input;
                        break;
                }
                if (cRepeated && oRepeated && nRepeated) {
                    System.out.printf("%s ", word);
                    cRepeated = false;
                    oRepeated = false;
                    nRepeated = false;
                    word = "";
                }
            }
            input = scanner.nextLine();
        }
    }
}
