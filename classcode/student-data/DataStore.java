public class DataStore {
  public static void main(String[] args) {
    // student 1
    String id1 = "1234567";
    String name1 = "Jimmy Smith";
    boolean cc1 = true;
    int[] grades1 = {90, 80, 95, 90, 100};

    // student 2
    String id2 = "9876543";
    String name2 = "Maria Hernandez";
    boolean cc2 = false;
    int[] grades2 = {95, 100, 100, 90, 90};

    // student 3
    String id3 = "1357911";
    String name3 = "Jamal Jenkins";
    boolean cc3 = false;
    int[] grades3 = {85, 85, 95, 100, 90};

    // student 4
    String id4 = "2468101";
    String name4 = "Ramiz Ahmed";
    boolean cc4 = true;
    int[] grades4 = {90, 100, 75, 85, 90};

    // student 5
    String id5 = "1928374";
    String name5 = "Michael Green";
    boolean cc5 = true;
    int[] grades5 = {80, 80, 65, 55, 90};

    Student student1 = new Student("1234567", "Jimmy Smith", true, new int[] {90, 80, 95, 90, 100});
    System.out.println(student1.getAverage());
  } // end main method

} // end class
