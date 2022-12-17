package com.code.staticblock;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double payment = scanner.nextDouble();
    scanner.close();

    // Write your code here.
    String us = returnPayment(payment , Locale.US);
    String india = returnPayment(payment , new Locale("en","IN"));
    String china = returnPayment(payment , Locale.CHINA);
    String france = returnPayment(payment , Locale.FRANCE);

    System.out.println("US: " + us);
    System.out.println("India: " + india);
    System.out.println("China: " + china);
    System.out.println("France: " + france);
  }
  private static String returnPayment(double payment, Locale locale){
    NumberFormat nF = NumberFormat.getCurrencyInstance(locale);

    return  nF.format(payment);
  }

}
