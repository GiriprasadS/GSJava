package flow.control;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Loops {
  public static void main(String[] args) {
    int x = 3;
    while (x > 0) {
      System.out.println("x is " + x);
//      x = x - 1;
//      x -= 1;
      x--; // x-- and --x, x++ and ++x
    }

    for (int y = 0; y < 4; y++) {
      System.out.println("y is " + y);
    }
//    System.out.println(y); // now out of scope!!!

    do {
      System.out.println(">>> x is now " + x);
      x++;
    } while (x < 4);

    String [] names = {"Fred", "Jim", "Sheila"};  // arrays are fixed size after creation.
    System.out.println("names[0] is " + names[0]);
    names[0] = "Frederick";
    System.out.println("names[0] is " + names[0]);
    System.out.println("names has " + names.length + " elements");
//    System.out.println("names[3] is " + names[3]); // indexes are ALWAYS zero-based

    for (String s : names) { // this loop does NOT maintain ANY INDEX COUNTER
      System.out.println(">>> " + s);
    }

    // "generics" -- compile time consistency checking ONLY
    // actual structure can contain anything
    List<String> nameList = new LinkedList<String>();
    nameList.add("Fred");
    nameList.add("Jim");
    nameList.add("Sheila");
    System.out.println("first name in list is " + nameList.get(0));
    nameList.set(0, "Frederick");
    System.out.println("first name in list is " + nameList.get(0));

    for (String n : nameList) {
      System.out.println(">> " + n);
    }
  }
}
