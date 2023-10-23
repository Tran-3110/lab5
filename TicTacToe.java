package main;

public class TicTacToe { 
private static final char EMPTY = ' '; 
 private char[][] board; 
 
	public TicTacToe(char[][] board) {
	this.board = board;
}

		/* 
		   * This method checks all rows and returns true if any of 
		 them are marked with 
		   * all of a single player's markers. 
		   * Otherwise, returns false. 
		   */ 
		  public boolean checkRows() {
			 int count = 0;
			 outer:
			  for (int i = 0; i < board.length; i++) {
				  count = 0;
				for (int j = 1; j < board[i].length; j++) {
					if(board[i][0] == EMPTY || board[i][0] != board[i][j]) {
						continue outer;
					}
					count++;
				}
				if(count == board[i].length-1) {
					return true;
				}
			}
		   return false; 
		  } 
		  
		  /*   
		  * This method checks all columns and returns true if any 
		  of them are marked 
		    * with all of a single player's. 
		    * Otherwise, returns false. 
		    */ 
		   public boolean checkColumns() { 
			   int count = 0;
			   outer:
				  for (int i = 0; i < board.length; i++) {
					  count = 0;
					for (int j = 1; j < board[i].length; j++) {
						if(board[0][i] == EMPTY || board[0][i] != board[j][i]) {
							continue outer;
						}
						count++;
					}
					if(count == board.length-1) {
						return true;
					}
				}
		    return false; 
		   } 
		   
		   /* 
		    * This method checks both diagonals and returns true if 
		  any of them are marked 
		    * with all of a single player's markers. Otherwise, 
		  returns false. 
		    */ 
		   public boolean checkDiagonals() { 
		    // Check top-left to bottom-right
			   boolean check = true;
			   for (int i = 1; i < board.length; i++) {
				if(board[0][0] != board[i][i] || board[0][0] == EMPTY) {
					check = false;
					break;
				}
			}
			   if(check == true) {
				  return check;
			   }
			   else {
				   check = true;
			   }
		  // Check bottom-left to top-right 
			   for (int i = 1; i < board.length; i++) {
				if(board[0][board.length-1] != board[i][board.length-1-i] || board[0][board.length-1] == EMPTY) {
					check = false;
					break;
				}
			}	   
		  return check; 
		  } 
		   
		   public static void main(String[] args) {
			char[][] arr = new char[][] {{'X', 'X', 'O'}, {EMPTY, 'X', 'O'}, {'O', 'X', 'X'}};
			TicTacToe t = new TicTacToe(arr);
			System.out.println(t.checkRows());
			System.out.println(t.checkColumns());
			System.out.println(t.checkDiagonals());
		}
}
