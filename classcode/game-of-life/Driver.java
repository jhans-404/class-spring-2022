public class Driver {
  public static void main(String[] args) {
    Grid world1 = new Grid(10, 10);
    System.out.println(world1);
    System.out.println(world1.countNeighbors(8, 8)); // 0
    System.out.println(world1.countNeighbors(2, 5)); // 1
    System.out.println(world1.countNeighbors(2, 4)); // 1
    System.out.println(world1.countNeighbors(2, 3)); // 2
    System.out.println(world1.countNeighbors(1, 3)); // 3
    System.out.println(world1.countNeighbors(3, 3)); // 3
    // int rowLength = 8;
    // int r = 7;
    // System.out.println((r + 1 + rowLength) % 8); // 7

  }
}
