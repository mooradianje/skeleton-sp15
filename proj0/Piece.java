public class Piece {

	private Piece(boolean isFire, Board b, int x, int y, String type) {
		//constructor for a piece - isfire determines whether water or fire
		//b represents the board that teh piece is on - used for move()
		// x,y is the position to initialize it
		// type is a string representing the type of piece [pawn,bomb,shield]

	}

	private boolean isFire() {
		//returns whether the piece is a fire piece
	} 

	private int side() {
		//returns 0 if the piece is a fire piece or 1 if water
		//just a tool you might want to use later - redundant with isFire()

	}

	private boolean isKing() {
		//returns whether the piece is a KING

	}

	private boolean isBomb() {
		//returns whether it's the bomb piece
	}

	private boolean isShield() {
		//returns whether it's a shield piece
	}

	private void move(int x, int y) {
		//assumes this piece's movement from its current position
		//to (x,y) is valid - moves piece to (x,y) capturing any
		//intermediate piece if possible - this will be tough to write
	}

	private boolean hasCaptured() {
		//returns whether the piece has captured another piece this turn

	}

	private void doneCapturing() {
		//called at the end of turn on the piece has moved - makes
		//sure the pieces hasCaptured() returns to false false
		
	}
}
