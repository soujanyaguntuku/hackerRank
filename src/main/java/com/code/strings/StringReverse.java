package com.code.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringReverse {
  public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    String A=sc.next();
    boolean flag = true;
    /* Enter your code here. Print output to STDOUT. */
    int length = A.length();
    for(int i=0; i < length/2; i++){
      if(A.charAt(i) != A.charAt(length-i-1)){
        flag = false;
        break;
      }
    }
    System.out.println((flag)?"Yes":"No");

     String name = "baeldung";
    name = "bael...";
    System.out.println(name);

    final List<String> strings = new ArrayList<>();
    List<String> strings2 = strings;
    strings.add("adbc");
  }
}
