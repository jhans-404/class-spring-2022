public class Rational {
  // instance variables
  private int num;
  private int den;

  // constructor
  public Rational() {
    this.num = 0;
    this.den = 1;
  }

  // overloaded constructor
  public Rational(int n, int d) {
    this.num = n;
    this.den = d;
  }

  // instance methods
  public void printRational() {
    System.out.println(this.num + "/" + this.den);
  }

  public void negate() {
    this.num *= -1;
  }

  public void invert() {
    int temp = this.num;
    this.num = this.den;
    this.den = temp;
  }

  public double toDouble() {
    return (double)this.num / this.den;
  }

  // override toString
  public String toString() {
    return this.num + "/" + this.den;
  }
}
