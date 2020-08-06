package com.stevenzhu;

import java.text.NumberFormat;

public class MortgageReport {

  static void printMortgage(int principal, float annualInterest, byte years) {
    double mortgage = Main.calculateMortgage(principal, annualInterest, years);
    String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
    System.out.println();
    System.out.println("MORTGAGE");
    System.out.println("--------");
    System.out.println("Monthly Payments: " + mortgageFormatted);
  }
}
