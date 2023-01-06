package MoreExercises;

import java.util.Scanner;

public class WeatherForecast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        if (text.equals("sunny")) {
            text = "It's warm outside!";
        } else {
            text = "It's cold outside!";
        }
        System.out.println(text);
    }
}
