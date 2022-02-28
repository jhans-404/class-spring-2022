public class Driver {
  public static void main(String[] args) {
    MetroCard card1 = new MetroCard("123456789");
    System.out.println(card1);
    // morning ride to school
    card1.swipe(550);
    System.out.println(card1);
    // friend forgot metro, try to share
    card1.swipe(551);
    System.out.println(card1);
    // school ends
    card1.swipe(1530);
    System.out.println(card1);
  }
}
