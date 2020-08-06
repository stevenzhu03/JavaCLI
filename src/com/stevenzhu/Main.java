package com.stevenzhu;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int principle;
        float annualInterest = 0;
        byte years = 0;

        Scanner scanner = new Scanner(System.in);

        principle = (int) readNumbers("Principal", 1000, 1_000_000);
        annualInterest = (float) readNumbers("Annual Interest Rate: ", 1, 30);
        years = (byte) readNumbers("Pay Period", 1 ,30);

        double mortgage = calculateMortage(principle, annualInterest, years);

        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + formattedMortgage);
    }

    public static double readNumbers(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
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


