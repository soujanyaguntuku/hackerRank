package com.code.staticblock;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormatSymbols;
import java.util.Calendar;

public class GetWeekDayFromCalender {
  private static final String[] DAY_NAMES = new String[] {"SUNDAY", "MONDAY",
     "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
//  /*
//   * Complete the 'findDay' function below.
//   *
//   * The function is expected to return a STRING.
//   * The function accepts following parameters:
//   *  1. INTEGER month
//   *  2. INTEGER day
//   *  3. INTEGER year
//   */
  public static String findDay(int month, int day, int year) {
    String[] DAY_NAMES = new String[] {"non-zero", "SUNDAY", "MONDAY",
        "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
   // String [] DAY_NAMES = new DateFormatSymbols().getWeekdays();
    Calendar cal = Calendar.getInstance();
    cal.set(year,month-1, day, 0, 0);
    return DAY_NAMES[cal.get(cal.DAY_OF_WEEK)];
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    int month = Integer.parseInt(firstMultipleInput[0]);

    int day = Integer.parseInt(firstMultipleInput[1]);

    int year = Integer.parseInt(firstMultipleInput[2]);

    String res = GetWeekDayFromCalender.findDay(month, day, year);

  //  bufferedWriter.write(res);
   // bufferedWriter.newLine();
    System.out.println(res);

    bufferedReader.close();
  //    bufferedWriter.close();
  }

}
