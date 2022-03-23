import java.util.*;

public class RemoveOdds {
  public static void main(String[] args) {
    ArrayList<Integer> myList = new ArrayList<Integer>();

    for(int i = 0; i < 10; i++) {
      myList.add((int)(Math.random() * 50));
    }

    // System.out.println(displayList(myList));
    System.out.println(myList);
    System.out.println();
    System.out.println();
    // loop through each value in the ArrayList
    for(int i = 0; i < myList.size(); i++) {
      // use mod to determine if the number is odd (val % 2 == 1)
      if(myList.get(i) % 2 == 1) {
        // if true, remove!
        myList.remove(i);
        i--;
      }
    }

    System.out.println(myList);

  }

  // unnecessary method, just print the ArrayList like in line 12
  // public static String displayList(ArrayList<Integer> l) {
  //   String output = "";
  //   for(int i = 0; i < l.size(); i++) {
  //     output += l.get(i) + " ";
  //   }
  //   return output;
  // }

}
