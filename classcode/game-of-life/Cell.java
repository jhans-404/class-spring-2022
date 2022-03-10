public class Cell {
  private int status;

  public Cell(int s) {
    this.status = s;
  }

  public int getStatus() {
    return this.status;
  }

  public void setStatus(int s) {
    this.status = s;
  }

  public String toString() {
    if(this.status == 0) {
      return "X";
    }
    else {
      return "O";
    }
  }
}
