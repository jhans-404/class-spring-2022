import java.util.*;

public class Deck {
  private ArrayList<Card> deck;

  public Deck() {
    this.deck = new ArrayList<Card>();

    for(int suit = 0; suit <= 3; suit++) {
      for(int value = 2; value <= 14; value++) {
        this.deck.add(new Card(value, suit));
      } // end inner for loop
    } // end outer for loop

  } // end constructor method

  public int getLength() {
    return deck.size();
  } // end getLength method

  public void shuffle() {
    /*
    // METHOD 1: grab randomly and build
    // new list
    ArrayList<Card> shuffledDeck = new ArrayList<Card>();
    int size = this.deck.size();

    for(int i = 0; i < size; i++) {
      // generate random number from 0 to 51 (.size() - 1)
      int r = (int)(Math.random() * (this.deck.size() - 1));

      // add the r-th card from deck into shuffledDeck and remove from deck
      shuffledDeck.add(this.deck.get(r));
      this.deck.remove(r);
    } // end for loop

    this.deck = shuffledDeck;
    */

    // METHOD 2: split into to and then merge back together
    ArrayList<Card> sub1 = new ArrayList<Card>();
    ArrayList<Card> sub2 = new ArrayList<Card>();

    for(int i = 0; i < this.deck.size() / 2; i++) {
      sub1.add(this.deck.get(i));
      sub2.add(this.deck.get(i + 26));
    }
  } // end shuffle method

  public void displayDeck() {
    for(Card c : this.deck) {
      System.out.println(c);
    }
  }

} // end class
