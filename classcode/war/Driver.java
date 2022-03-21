import java.util.*;

public class Driver {
  public static void main(String[] args) {

    // create a deck for testing
    Deck deck1 = new Deck();

    System.out.println(deck1.getLength()); // 52 cards in a standard deck
    // deck1.displayDeck();
    for(int i = 0; i < 8; i++) {
      deck1.shuffle();
      System.out.println("SHUFFLE #" + (i + 1));
      deck1.displayDeck();
    }


    deck1.displayDeck();
    System.out.println(deck1.getLength());
  }
}
