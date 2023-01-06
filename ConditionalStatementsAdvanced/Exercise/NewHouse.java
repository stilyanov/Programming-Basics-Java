package Exercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int flowersCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;
//      •	Ако Нели купи повече от 80 Рози - 10% отстъпка от крайната цена
//      •	Ако Нели купи повече от 90  Далии - 15% отстъпка от крайната цена
//      •	Ако Нели купи повече от 80 Лалета - 15% отстъпка от крайната цена
//      •	Ако Нели купи по-малко от 120 Нарциса - цената се оскъпява с 15%
//      •	Ако Нели Купи по-малко от 80 Гладиоли - цената се оскъпява с 20%
        switch (flowers) {
            case "Roses":
                totalPrice = flowersCount * 5;
                if (flowersCount > 80) {
                    totalPrice = totalPrice - (totalPrice * 0.10);
                }
                break;
            case "Dahlias":
                totalPrice = flowersCount * 3.80;
                if (flowersCount > 90) {
                    totalPrice = totalPrice - (totalPrice * 0.15);
                }
                break;
            case "Tulips":
                totalPrice = flowersCount * 2.80;
                if (flowersCount > 80) {
                    totalPrice = totalPrice - (totalPrice * 0.15);
                }
                break;
            case "Narcissus":
                totalPrice = flowersCount * 3;
                if (flowersCount < 120) {
                    totalPrice = totalPrice + (totalPrice * 0.15);
                }
                break;
            case "Gladiolus":
                totalPrice = flowersCount * 2.50;
                if (flowersCount < 80) {
                    totalPrice = totalPrice + (totalPrice * 0.20);
                }
                break;
        }
        if (budget >= totalPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersCount, flowers, budget - totalPrice);
        } else if (budget < totalPrice) {
            System.out.printf("Not enough money, you need %.2f leva more.", totalPrice - budget);
        }
    }
}
