package Exam_March;

import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoin = Integer.parseInt(scanner.nextLine());
        double chinese = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());
        //•	1 биткойн = 1168 лева.
        //•	1 китайски юан = 0.15 долара.
        //•	1 долар = 1.76 лева.
        //•	1 евро = 1.95 лева.
        double bitcoinPrice = bitcoin * 1168; //лева
        double chinesePrice = chinese * 0.15; //долари
        double dollar = 1.76; //лева
        double euro = 1.95; // лева
        double chineseLeva = dollar * chinesePrice;
        double allInEuro = (bitcoinPrice + chineseLeva) / euro;
        double commissionTotal = allInEuro * commission * 0.01;
        double total = allInEuro  - commissionTotal;
        System.out.printf("%.2f", total);
    }
}
