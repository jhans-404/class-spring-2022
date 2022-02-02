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
  for(int r = 0; r < board.length; r++) {
    for(int c = 0; c < board[r].length; c++) {
      if(board[r][c].equals("X")) {
        fill(255, 0, 0);
        ellipse(75 + c * 50, 75 + r * 50, 48, 48);
      } 
      else if(board[r][c].equals("O")) {
        fill(255, 255, 0);
        ellipse(75 + c * 50, 75 + r * 50, 48, 48);
      }
    }
  }
} // end displayBoard method


void keyPressed() {
  if(round % 2 == 0 && key == '1') {
    // drop piece method
    board[5][1] = "X";  
    round++;
  }
  
} // end keyPressed method
