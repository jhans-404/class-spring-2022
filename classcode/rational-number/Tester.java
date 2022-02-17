public class Tester {
  public static void main(String[] args) {
    // sample objects
    Rational frac1 = new Rational();
    Rational frac2 = new Rational(1, 3);

    // frac1.printRational();
    // frac2.printRational();

    System.out.println(frac1);
    System.out.println(frac2);

    System.out.println(frac2.toDouble());
  }
}
