package functions;

// no "extends"?? then you are a subclass of Object
public class Date /*extends Object*/ {
  // "default" accessibility is "anwhere inside the same package"
  // private means "accessible between the enclosing top-level curly braces"
  private int day;
  private int month;
  private int year;

//  class Stuff {
//    private int x;
//  }
//  public void initialize(Date this, int day, int month, int year) {
  public Date(/*Date this, */int day, int month, int year) {
    if (!isValid(day, month, year)) throw new IllegalArgumentException("Bad date values");
    this.day = day;
    this.month = month;
    this.year = year;
  }
  public static boolean isLeapYear(int year) {
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
  }
  // Java does NOT have "default values" for arguments
  // this method's name is: functions.Date.daysInMonth_int_int
  public static int daysInMonth(int month, int year) {
    if (month > 12 || month < 1) {
      throw new IllegalArgumentException("bad month");
    }
    switch(month) {
      case 9: case 4: case 6: case 11: return 30;
//      case 2: return functions.Date.isLeapYear(year) ? 29 : 28;
      case 2: return isLeapYear(year) ? 29 : 28;
      default: return 31;
    }
  }
  // method "overloading"
  public static int daysInMonth(int month) {
    return daysInMonth(month, 2021);
  }
  // Java DOES have "variable length argument lists", use ..., last arg only, behaves like array


//  public static int dayOfWeek(Date self) {
  // non-static makes this an "instance" method
//  public int dayOfWeek(@Deprecated Date this) {
//  public int dayOfWeek(Date this) {
  public int dayOfWeek() {
//    return dayOfWeek(this.day, this.month, this.year);
//    int day = 99;
    // unqualified variables (i.e. nothing with a dot in front) will always
    // refer to the "nearest" variable of that name (usually a method local).
    return dayOfWeek(day, month, year);
  }
  // Zeller's congruence
  // 0 = Saturday
  public static int dayOfWeek(int day, int month, int year) {
    if (month < 3) {
      month += 12;
      year -= 1; // year--
    }
    return (day + (13 * (month + 1) / 5) + year + year / 4 - year / 100 + year / 400) % 7;
  }

  public void setDay(int day) {
    if (!isValid(day, this.month, this.year)) throw new IllegalArgumentException("Bad day");
  }
  public int getDay() {
    return day;
  }

  public int getMonth() {
    return month;
  }

  public int getYear() {
    return year;
  }

//  public String asText() {
  public String toString() {
    return "day=" + this.day + ", month=" + this.month + ", year=" + this.year;
  }

  public static boolean isValid(int day, int month, int year) {
    return day > 0 && day <= daysInMonth(month, year) && month > 0 && month < 13;
  }
}
