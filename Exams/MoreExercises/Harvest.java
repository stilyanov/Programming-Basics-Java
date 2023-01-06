package MoreExercises;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine()); //кв.м лозе
        double y = Double.parseDouble(scanner.nextLine()); //грозде за един кв.м
        int z = Integer.parseInt(scanner.nextLine()); //нужни литри вино
        int workers = Integer.parseInt(scanner.nextLine());

        double totalGrape = x * y; //общо грозде
        double countGrapeWine = totalGrape * 0.4;
        double litersWine = countGrapeWine / 2.5;


        if (litersWine >= z) {
            System.out.printf("Good harvest this year! Total wine: %d liters.%n",(int) Math.floor(litersWine));
            System.out.printf("%d liters left -> %d liters per person.",(int) Math.ceil(litersWine - z),(int) Math.ceil((litersWine - z) / workers));
        } else if (litersWine < z){
            System.out.printf("It will be a tough winter! More %d liters wine needed.",(int) Math.floor(z - litersWine));
        }
    }
}
