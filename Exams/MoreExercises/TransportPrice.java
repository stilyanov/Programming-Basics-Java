package MoreExercises;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());//брой километри
        String dayOrNight = scanner.nextLine();
        double taxi = 0.0;
        double price = 0.0;
        //Такси. Начална такса: 0.70 лв. Дневна тарифа: 0.79 лв. / км. Нощна тарифа: 0.90 лв. / км.
        //Автобус. Дневна / нощна тарифа: 0.09 лв. / км. Може да се използва за разстояния минимум 20 км.
        //Влак. Дневна / нощна тарифа: 0.06 лв. / км. Може да се използва за разстояния минимум 100 км.
        if (dayOrNight.equals("day")) {
            price = 0.79;
        } else if (dayOrNight.equals("night")) {
            price = 0.90;
        }

        if (n < 20) {
            taxi = 0.70 + n * price;
        } else if (n < 100){
            taxi = 0.09 * n;
        } else {
            taxi = 0.06 * n;
        }
        System.out.printf("%.2f", taxi);
    }
}
