public class ArrayResizer {
  public static void main(String[] args) {
    int[][] testArray = {{2, 1, 0},
                         {1, 3, 2},
                         {0, 0, 0},
                         {4, 5, 6},
                       };

    System.out.println(isNonZeroRow(testArray, 0)); // false
    System.out.println(isNonZeroRow(testArray, 1)); // true
    System.out.println(isNonZeroRow(testArray, 2)); // false
    System.out.println(isNonZeroRow(testArray, 3)); // true
  } // end main method

  public static boolean isNonZeroRow(int[][] arr, int r) {
    // loop through each element in the row
    // go column by column, and grab each element one at a time
    for (int c = 0; c < arr[r].length; c++) {
      // is the element in the row zero?
      if (arr[r][c] == 0) {
        return false;
      } // end if statement
    } // end for loop

    // alternative solution using for-each loop
    // for (int value : arr[r]) {
    //   if (value == 0) {
    //     return false;
    //   } // end if statement
    // } // end for loop

    // if we never find a 0, then IS a non-zero row, so return true
    return true;
  } // end isNonZeroRow method

  public static int[][] resize(int[][] arr) {
    int[][] result = new int[0][0];

    return result;
  } // end resize method

  public static int numNonZeroRows(int[][] arr) {

    return -1;
  } // end numNonZeroRows method

} // end class
