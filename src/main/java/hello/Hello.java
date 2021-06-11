
// package comes "first"
package hello;

// many import statements...
import java.util.Arrays;
// java.lang is always imported for us
//import java.lang.System;
import static java.lang.System.out;

/*
Compile example:
src/main/java$ javac -d classes hello/*.java
Run example:
/src/main/java$ java -cp classes  hello.Hello
 */

// Types (classes, interfaces, enums) come last
// ONLY ONE public type (filename MUST match!)
public class Hello {
  public static void main(String [] args) {
    out.println("Hello Java World!");
    System.out.println("Arguments:");
    System.out.println(Arrays.toString(args));
//    System.out.println(java.util.Arrays.toString(args));
    var x = 99;
//    int x = 99;
//    x = 3.14; // nope, strong static typing, can only use for an int
    out.println(x);

    String message = "Hello Everyone!";

    int a = 99;
    float b = 3.14F;
    var r = a * b;

    out.println(a > b);
    out.println(a == b);
    out.println();
  }
}
