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

        System.out.print("Period(Years: ");

    }
}
