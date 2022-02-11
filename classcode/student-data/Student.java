public class Student {
  // fields, instance varaibles (data)
  // each instance of the Student class gets a copy of each variable
  private String id;
  private String name;
  private boolean closeContact;
  private int[] grades;

  // constuctor method
  public Student(String id, String n, boolean cc, int[] g) {
    this.id = id;
    this.name = n;
    this.closeContact = cc;
    this.grades = g;
  }


  // behaviors (methods)

  // get the close contact status of the student
  public boolean getCloseContact() {
    return this.closeContact;
  } // end isCloseContact method

  // set the value of close contact
  public void setCloseContact(boolean value) {

  }

  // see if the student is failing
  public boolean isFailing() {

    return false;
  }

  // get object's name value
  public String getName() {
    return this.name;
  }

  public double getAverage() {
    int total = 0;

    for (int grade : this.grades) {
      total += grade;
    } // end for-each loop
    return total / grades.length;
  } // end getAverage method

}
