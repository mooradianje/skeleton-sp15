public class Piece {

	public Piece(boolean isFire, board b, int x, int y, String type) {
		//constructor for a piece - isfire determines whether water or fire
		//b represents the board that teh piece is on - used for move()
		// x,y is the position to initialize it
		// type is a string representing the type of piece [pawn,bomb,shield]
		isFire = isFire;
		b = b;
		x = x;
		y = y;
		type = type;
	}

	public boolean isFire() {
		//returns whether the piece is a fire piece
		return true;
	} 

	private int side() {
		//returns 0 if the piece is a fire piece or 1 if water
		//just a tool you might want to use later - redundant with isFire()
		return 0;
	}

	private boolean isKing() {
		//returns whether the piece is a KING
		return false;
	}

	private boolean isBomb() {
		//returns whether it's the bomb piece
		return false;
	}

	private boolean isShield() {
		//returns whether it's a shield piece
		return false;

	}

	private void move(int x, int y) {
		//assumes this piece's movement from its current position
		//to (x,y) is valid - moves piece to (x,y) capturing any
		//intermediate piece if possible - this will be tough to write

	}

	private boolean hasCaptured() {
		//returns whether the piece has captured another piece this turn
		return false;
	}

	private void doneCapturing() {
		//called at the end of turn on the piece has moved - makes
		//sure the pieces hasCaptured() returns to false false
		
	}
}
