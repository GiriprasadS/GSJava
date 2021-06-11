package use.dates;

import functions.Date;
import functions.Holiday;

import static functions.Date.dayOfWeek;

public class UseDate {
  public static void main(String[] args) {
    int dim = Date.daysInMonth(2, 2000);
    System.out.println(dim);
    System.out.println("Day of week of Jan 1, 2000: " + dayOfWeek(1, 1, 2000));

//    Date theBirthday = new Date();
//    theBirthday.initialize(11, -6, 2021);
    Date theBirthday = new Date(11, 6, 2021);
//    theBirthday.day = -99;
//    theBirthday.setDay(31);
    theBirthday.setDay(30);
//    System.out.println("day? " + theBirthday.day);
    System.out.println("day? " + theBirthday.getDay());
//    System.out.println("day? " + theBirthday.asText());
//    System.out.println("day? " + theBirthday.toString());
    System.out.println("day? " + theBirthday);

//    theBirthday.day = 11;
//    theBirthday.month = 6;
//    theBirthday.year = 2021;

//    System.out.println("Today is " + Date.dayOfWeek(theBirthday));
    System.out.println("Today is " + theBirthday.dayOfWeek());

    Date hol = new Holiday(1, 1, 2022, "New Year's Day");
    System.out.println("Holiday day is " + hol.getDay());
    System.out.println("Holiday day is " + hol);

    try {
      Date bad = new Date(-1, 1, 2000);
      System.out.println("Date is " + bad);
    } catch (NullPointerException ie) {
      System.out.println("Oops, didn't work " + ie.getMessage());
    } finally {
      System.out.println("Good or bad, we get here");
    }
    System.out.println("Still alive!");
  }
}
