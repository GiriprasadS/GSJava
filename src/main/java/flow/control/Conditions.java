package flow.control;

public class Conditions {
  public static void main(String[] args) {
    double d = Math.random();
    if (d > 0.5) { // NO "truthy/falsy" concept. MUST be boolean
      System.out.println("It's big: " + d);
    } else {
      System.out.println("not so big..." + d);
    }

    int x = (int)(d * 10);
    switch (x) {
      case 0:
        System.out.println("it's a zero");
        System.out.println("Still going");
        break;
      case 1:
        System.out.println("it's a one");
        break;
      case 2:
      case 4:
      case 6:
      case 8:
        System.out.println("medium sized and even!");
        break;
      default:
        System.out.println("it's something else");
        break;
    }
  }
}
