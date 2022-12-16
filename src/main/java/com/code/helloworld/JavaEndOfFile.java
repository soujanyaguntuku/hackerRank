package com.code.helloworld;

import java.util.Scanner;

public class JavaEndOfFile {
  public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    int i =1;
    while(sc.hasNext()){
      String s1 = sc.nextLine();
      System.out.printf("%d %s %n", i++, s1);
    }
    sc.close();
  }

}
