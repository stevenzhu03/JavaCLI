package com.stevenzhu;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int principle;
        float annualInterest = 0;
        byte years = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Annual Interest Rate: ");

            annualInterest = scanner.nextFloat();
            if (annualInterest > 1 && annualInterest <= 30)
                break;
            System.out.println("Please enter an annual interest rate between 1 and 30.");
        }

        while (true) {
            System.out.print("Period (Years): ");
            years = scanner.nextByte();
            if (years > 1 && years <= 30)
                break;
            System.out.println("Please enter a period between 1 and 30.");
        }

        double mortgage = calculateMortage(principle, annualInterest, years);

        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + formattedMortgage);
    }

    public static double readNumbers(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print("Principle: ");
            value = scanner.nextFloat();

            if(value > min && value <= max)
                break;
            System.out.println("Enter a value amount between" + min + "and" + max);
        }

        return value;
    }

    public static double calculateMortage(
            int principle,
            float annualInterest,
            byte years) {

        final byte PERCENT = 100;
        final byte MONTHS_IN_YEAR = 12;

        float monthlyInterest = annualInterest / MONTHS_IN_YEAR / PERCENT;
        short numberOfPayments = (short)(years * MONTHS_IN_YEAR);

        double mortgage = principle * (monthlyInterest * Math.pow(1+monthlyInterest, numberOfPayments)) / (Math.pow(1+monthlyInterest, numberOfPayments) -1);

        return mortgage;
    }
}


