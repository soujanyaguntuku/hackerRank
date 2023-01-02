package com.code.strings;

import java.util.Scanner;

public class subStringComaprision {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    int k = scan.nextInt();
    scan.close();

    System.out.println(getSmallestAndLargest(s, k));
  }
  public static String getSmallestAndLargest(String s, int k) {
    String smallest;
    String largest;

    // Complete the function
    // 'smallest' must be the lexicographically smallest substring of length 'k'
    // 'largest' must be the lexicographically largest substring of length 'k'
    java.util.ArrayList<String> list = new java.util.ArrayList<>();
    for(int i=0;i<=s.length()-k;i++){
      list.add(s.substring(i,i+k));
    }
    smallest=largest=list.get(0);

    for(String x:list){
      if(x.compareTo(smallest)<0){
        smallest=x;
      }
      if(x.compareTo(largest)>0){
        largest=x;
      }
    }
    return smallest + "\n" + largest;
  }
}
