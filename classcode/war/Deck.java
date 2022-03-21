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

    // METHOD 2: split into two and then merge back together (out method)
    ArrayList<Card> sub1 = new ArrayList<Card>();
    ArrayList<Card> sub2 = new ArrayList<Card>();

    for(int i = 0; i < this.deck.size() / 2; i++) {
      sub1.add(this.deck.get(i));
      sub2.add(this.deck.get(i + 26));
    }

    // grab from the bottom of each sub-array and place in the back of deck
    int i = this.deck.size() - 1;

    // System.out.println(sub1.get(0));
    // System.out.println(sub2.get(0));
    while(sub1.size() > 0) {
      this.deck.set(i, sub2.get(sub2.size() - 1)); // get last item from sub2
      this.deck.set(i - 1, sub1.get(sub1.size() - 1)); // get last item from sub1
      sub2.remove(sub2.size() - 1);
      sub1.remove(sub1.size() - 1);
      i -= 2;
    }

  } // end shuffle method

  public void displayDeck() {
    for(Card c : this.deck) {
      System.out.println(c);
    }
  }

} // end class
