package com.stevenzhu;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte PERCENT = 100;
        final byte MONTHS_IN_YEAR = 12;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principle: ");
        while(!scanner.hasNextInt()){
            System.out.println("This is not a number");
            System.out.print("Please enter your principle: ");
            scanner.next();
        }
        int principle = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / MONTHS_IN_YEAR / PERCENT;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principle * (monthlyInterest * Math.pow(1+monthlyInterest, numberOfPayments)) / (Math.pow(1+monthlyInterest, numberOfPayments) -1);

        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + formattedMortgage);
        System.out.println("Mortgage: " + formattedMortgage);
    }
}
