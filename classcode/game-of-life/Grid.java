public class Grid {
  Cell[][] world;
  private int generation;
  private int populationSize;

  public Grid(int r, int c) {
    world = new Cell[r][c];
    this.generation = 1;
    this.populationSize = 0;

    for(int i = 0; i < this.world.length; i++) {
      for(int j = 0; j < this.world[i].length; j++) {
        if(i == 2 && (j == 2 || j == 3 || j == 4)) {
          world[i][j] = new Cell(1);
          this.populationSize++;
        }
        else {
          world[i][j] = new Cell(0);
        }
      }
    }
  }

  public int countNeighbors(int r, int c) {
    int count = 0;

    for(int i = -1; i <= 1; i++) {
      for(int j = -1; j <= 1; j++) {
        if(world[r + i][c + j].getStatus() == 1) {
          count++;
        }
      }
    }
    
    if(world[r][c].getStatus() == 1) {
      count--;
    }

    return count;
  }

  public String toString() {
    String myString = "";
    for(int i = 0; i < this.world.length; i++) {
      for(int j = 0; j < this.world[i].length; j++) {
        myString += world[i][j].getStatus() + "  ";
      }
      myString += "\n";
    }
    myString += "generation: " + this.generation + "\n";
    myString += "population: " + this.populationSize;
    return myString;
  }

}
