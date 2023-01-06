package MoreExercises;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //  обем на басейна
        int v = Integer.parseInt(scanner.nextLine());
        //  дебит на първата тръба за час
        int p1 = Integer.parseInt(scanner.nextLine());
        //  дебит на втората тръба за час
        int p2 = Integer.parseInt(scanner.nextLine());
        //  часовете които работникът отсъства
        double h = Double.parseDouble(scanner.nextLine());

        double firstPipeDebit = p1 * h;
        double secondPipeDebit = p2 * h;
        double poolDebit = firstPipeDebit + secondPipeDebit;
        double percentDebit = poolDebit / v * 100;
        double firstPipePercentage = firstPipeDebit / poolDebit * 100;
        double secondPipePercentage = secondPipeDebit / poolDebit * 100;
        double overFlow = poolDebit - v;

        if (poolDebit <= v) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", percentDebit, firstPipePercentage, secondPipePercentage);
        } else {
            double water = 0;
            water = poolDebit - v;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", h, water);
        }
    }
}
