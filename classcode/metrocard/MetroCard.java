public class MetroCard {
  private int lastSwipeTime;
  private String serialNumber;
  private String type; // think about this at a later date
  private double value; // not necessary for student card
  private int numRides;

  public MetroCard(String serialNum) {
    this.serialNumber = serialNum;
    this.numRides = 3;
    this.lastSwipeTime = 0;
  }

  public void swipe(int time) {
    if (this.numRides > 0 && time - this.lastSwipeTime > 15) {
      System.out.println("Have a nice ride!");
      this.numRides--;
      this.lastSwipeTime = time;
    }
  }

  public String toString() {
    return "MetroCard " + this.serialNumber + " was last swiped at " + this.lastSwipeTime + " and has " + this.numRides + " rides left.";
  }
}
