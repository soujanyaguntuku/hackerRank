package com.code.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserNameValidation {
  public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    int iterations = sc.nextInt();

    while (--iterations != 0){
      String userName = sc.next();

      if(userName.matches(UserNameValidator.REGEX_USERNAME)){
        System.out.println("Valid");
      }
      else{
        System.out.println("Invalid");
      }
    }
  }
}
class UserNameValidator {
  // Regex can be "^[A-Za-z][A-Za-z0-9_]{7,29}$"
  public static final String REGEX_USERNAME = "^[A-Za-z]\\w{7,29}$";
}