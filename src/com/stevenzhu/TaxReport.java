package com.stevenzhu;

public class TaxReport {
  private TaxCalculator calculator;

  public TaxReport () {
    calculator  = new TaxCalculator(1000);

  }

  public void show() {
    var tax = calculator.calculateTax();
    System.out.println(tax);
  }

}
