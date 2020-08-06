package com.stevenzhu;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int principle;
        float monthlyInterest;
        int numberOfPayments;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Principle: ");
            principle = scanner.nextInt();

            if(principle > 1000 && principle <= 1_000_000)
                break;
            System.out.println("Enter a principle amount between 100 and 1,000,000");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");

            float annualInterest = scanner.nextFloat();
            if (annualInterest > 1 && annualInterest <= 30)
                break;
            System.out.println("Please enter an annual interest rate between 1 and 30.");
        }

        while (true) {
            System.out.print("Period (Years): ");
            byte years = scanner.nextByte();
            if (years > 1 && years <= 30)
                break;
            System.out.println("Please enter a period between 1 and 30.");
        }

        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + formattedMortgage);
    }

    public static double calculateMortage(
            int principle,
            float annualInterest,
            byte years) {

        final byte PERCENT = 100;
        final byte MONTHS_IN_YEAR = 12;

        float monthlyInterest = annualInterest / MONTHS_IN_YEAR / PERCENT;
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principle * (monthlyInterest * Math.pow(1+monthlyInterest, numberOfPayments)) / (Math.pow(1+monthlyInterest, numberOfPayments) -1);

        return mortgage
    }
}


