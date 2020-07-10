public class GameStrategy {
	private boolean placedQueens[][] = new boolean[8][8];
	private int numQueens = 0;

	private int getColumn(int cellId) {
		return cellId % 8; 	
	}
	
	private int getRow(int cellId) {
		return cellId / 8;
	}
	
	
	
	public boolean isValidPosition(int cellId) {
		if(numQueens == 8) throw new GameOverException();	// just return out of the method

		// the game is still on, so let us continue...
		
		int col = getColumn(cellId); //Get column number (from 0 to 7)		
		int row = getRow(cellId); //Get row number (from 0 to 7)

		for (int i = 0; i < 8; i ++) {
			if (placedQueens[row][i]) return false; //Checking if there is any queen in same row
			if (placedQueens[i][col]) return false; //Checking if there is any queen in same column
		}

		for(int i = row,j = col; i >= 0 && j >= 0; i--,j--) {
			if (placedQueens[i][j]) return false; //Checking if there is any queen in lower left diagonal
		}
		
		for(int i = row,j = col; i < 8 && j < 8; i++,j++) {
			if (placedQueens[i][j]) return false; //Checking if there is any queen in upper right diagonal
		}
		
		for(int i = row,j = col; i >= 0 && j < 8; i--,j++) {
			if (placedQueens[i][j]) return false; //Checking if there is any queen in lower right diagonal
		}
		
		for(int i = row,j = col; i < 8 && j >= 0; i++,j--) {
			if (placedQueens[i][j]) return false; //Checking if there is any queen in upper left diagonal
		}
		placedQueens[row][col] = true; //If Queen nowhere in any sides or diagonals, place the queen
		numQueens++; // Incrementing the number of Queens placed
		return true; 
	}
}














