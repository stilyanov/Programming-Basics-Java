package Exam_March;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rent = Double.parseDouble(scanner.nextLine());
        //•	Торта  – цената ѝ е 20% от наема на залата
        //•	Напитки – цената им е 45% по-малко от тази на тортата
        //•	Аниматор – цената му е 1/3 от цената за наема на залата
        double cake = rent * 0.20;
        double drinks = cake - (cake * 0.45);
        double animator = rent / 3;
        double sum = cake + drinks + animator + rent;
        System.out.println(sum);
    }
}
