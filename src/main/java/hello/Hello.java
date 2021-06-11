
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

    String s1 = new String("Hello");
    String s2 = new String("Hello");
    out.println("s1 and s2 are == ? " + (s1 == s2));
    out.println("s1 and s2 are equivalent ? " + (s1.equals(s2)));

    out.println("s1 is " + s1);
    s1 = s1.toUpperCase();
    out.println("s1 is " + s1);

    StringBuilder sb1 = new StringBuilder("Hello sb");
    StringBuilder sb2 = new StringBuilder("Hello sb");

    out.println("sb1 is " + sb1);
    out.println("sb2 is " + sb2);
    out.println("sb1 == sb2 " + (sb1 == sb2));
    out.println("sb1 equavalent to sb2 " + (sb1.equals(sb2)));

    out.println("sb1 is " + sb1);
    sb1.append(" it's a lovely day");
    out.println("sb1 is " + sb1);

  }
}
