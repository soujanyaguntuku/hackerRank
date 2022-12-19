package com.code.staticblock;

public class TwoStaticClassExecution {
  public static int a=1;
  static {
    System.out.println("2");
  }
}
class B{
  static {
    System.out.println("3");
  }
  public static void main(String args[]){
    System.out.println("4");

    System.out.println(TwoStaticClassExecution.a);
  }
}
