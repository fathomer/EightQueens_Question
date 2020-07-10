public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {
		boolean isEvenRow = false;
		if ((square/8)%2==0) isEvenRow = true; 
		if (isEvenRow) {
			if (square%2 != 0)
				return true;
			return false;
		}
		if (square%2 == 0)
			return true;
		return false;
	}
}
