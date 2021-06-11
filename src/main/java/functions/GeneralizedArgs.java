package functions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GeneralizedArgs {

//  public static void showAll(List<String> als) {
  public static void showAll(Iterable<String> als) {
    for (String s : als) {
      System.out.println("> " + s);
    }
    System.out.println("---------------------");
  }
  public static void main(String[] args) {
//    List<String> nameList = new LinkedList<String>();
//    nameList.add("Fred");
//    nameList.add("Jim");
//    nameList.add("Sheila");

    // List.of is "unmodifiable" (i.e. add/remove etc. fail
    // Java 9+
    List<String> nameList = List.of("Fred", "Jim", "Sheila");

    showAll(nameList);
  }
}
