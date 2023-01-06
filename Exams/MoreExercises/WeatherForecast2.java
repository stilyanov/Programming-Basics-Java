package MoreExercises;

import java.util.Scanner;

public class WeatherForecast2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double degrees = Double.parseDouble(scanner.nextLine());
        String text = "";
        //Градуси	Време
        //26.00 - 35.00	Hot
        //20.1 - 25.9	Warm
        //15.00 - 20.00	Mild
        //12.00 - 14.9	Cool
        //5.00 - 11.9	Cold

        if (degrees <= 5) {
            text = "unknown";
        } else if (degrees <= 11.9) {
            text = "Cold";
        } else if (degrees <= 14.9) {
            text = "Cool";
        } else if (degrees <= 20.00) {
            text = "Mild";
        }else if (degrees <= 25.9) {
            text = "Warm";
        } else if (degrees <= 35.00) {
            text = "Hot";
        } else {
            text = "unknown";
        }

        System.out.println(text);
    }
}
