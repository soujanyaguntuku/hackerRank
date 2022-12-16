package com.code.staticblock;

import java.util.Scanner;

public class StaticIntializeBlock {
  static int B, H;
  static boolean flag = true;
  static {

    Scanner sc = new Scanner(System.in);
    B = sc.nextInt();
    H = sc.nextInt();
    sc.close();
    try {
      if (B <= 0 || H <= 0)
        throw new Exception("java.lang.Exception: Breadth and height must be positive");
      else
        System.out.println(B * H);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

  }
  public static void main(String args[]){

  }
}
