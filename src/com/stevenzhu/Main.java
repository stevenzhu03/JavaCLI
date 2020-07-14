package com.stevenzhu;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte PERCENT = 100;
        final byte MONTHS_IN_YEAR = 12;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principle: ");
        int principle = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / MONTHS_IN_YEAR / PERCENT;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortage = principle * (monthlyInterest * Math.pow(1+monthlyInterest, numberOfPayments)) / (Math.pow(1+monthlyInterest, numberOfPayments) -1);

        String formattedMortage = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println("Mortgage: " + formattedMortage);
    }
}
