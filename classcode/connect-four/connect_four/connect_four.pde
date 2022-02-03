String board[][];
int round = 0;

void setup() {
  size(450, 400);
 
  board = new String[6][7];
  fillBoard();
  
  board[5][2] = "X";
  board[5][5] = "X";
  board[5][3] = "O"; 
  
} // end setup method


void draw() {
  background(0, 0, 255);
  displayGrid();
  displayBoard();
  
  fill(255);
  textSize(24);
  if(round % 2 == 0) {
    text("Player 1's Turn", width/2, 385);  
  }
  else {
    text("Player 2's Turn", width/2, 385);
  }
  
} // end draw method


void fillBoard() {
  for(int r = 0; r < board.length; r++) {
    for(int c = 0; c < board[r].length; c++) {
      board[r][c] = ""; 
    }
  }  
  
} // end fillBoard method


void displayGrid() {
  for(int r = 0; r < board.length; r++) {
    for(int c = 0; c < board[r].length; c++) {
      fill(220);
      stroke(0, 0, 255);
      rect(50 + c * 50, 50 + r * 50, 50, 50);
    }
  }
  
  textSize(36);
  textAlign(CENTER);
  text("Connect 4", width/2, 35);
  
} // end displayGrid method


void displayBoard() {
  noStroke();
  
  // nested for loops to access each row
  // and column in each row
  for(int r = 0; r < board.length; r++) {
    for(int c = 0; c < board[r].length; c++) {
      
      // if there's a player 1 piece, make red circle
      if(board[r][c].equals("X")) {
        fill(255, 0, 0);
        
        // plus 75 allows for the circle to be centered in the box
        ellipse(75 + c * 50, 75 + r * 50, 48, 48);
      } 
      
      // if the first player didn't play that square
      // check to see if the second player did
      else if(board[r][c].equals("O")) {
        // if yes, draw a yellow circle
        fill(255, 255, 0);
        ellipse(75 + c * 50, 75 + r * 50, 48, 48);
      }
    }
  }
} // end displayBoard method


void keyPressed() {
  int col = key - 49; // subtracting 49 works???
  
  if(round % 2 == 0) {
    // drop piece method
    board[rowPlay(col)][col] = "X";  
    round++;
  }
  else if(round % 2 == 1) {
    // drop piece method
    board[rowPlay(col)][col] = "O";  
    round++;
  }
  
} // end keyPressed method

int rowPlay(int c) {
  // only focusing on the column the user wants
  for (int r = 0; r < board.length; r++) {
    // find the top-most cell that is occupied
    if (!board[r][c].equals("")) {
      // play the cell directly above
      return r - 1;  
    }
  }
 
  // if we get down here, the full column is unoccupied
  return board.length - 1;
}
