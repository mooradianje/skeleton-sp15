public class Piece {

    private boolean firecheck;
    private boolean isKing;
    private boolean hasCaptured;
    private String type;
    
	public Piece(boolean isFire, board b, int x, int y, String type) {
		//constructor for a piece - isfire determines whether water or fire
		//b represents the board that teh piece is on - used for move()
		// x,y is the position to initialize it
		// type is a string representing the type of piece [pawn,bomb,shield]
		isFire = isFire;
		firecheck = isFire;
		b = b;
		x = x;
		y = y;
		type = type;
		isKing=false;
	}

	public boolean isFire() {
		//returns whether the piece is a fire piece
		return firecheck;
	} 

	public int side() {
		//returns 0 if the piece is a fire piece or 1 if water
		//just a tool you might want to use later - redundant with isFire()
		if (firecheck == true) {
		    return 0;
		} else {
		    return 1;
		}
	}

	public boolean isKing() {
		//returns whether the piece is a KING
		return isKing;
	}

	public boolean isBomb() {
		//returns whether it's the bomb piece
		if (type == "bomb") {
		    return true;
		}
		return false;
	}

	public boolean isShield() {
		//returns whether it's a shield piece
		if (type == "shield") {
		    return true;
		}
		return false;

	}

	public void move(int x, int y) {
		//assumes this piece's movement from its current position
		//to (x,y) is valid - moves piece to (x,y) capturing any
		//intermediate piece if possible - this will be tough to write

	}

	public boolean hasCaptured() {
		//returns whether the piece has captured another piece this turn
		return hasCaptured;
	}

	public void doneCapturing() {
		//called at the end of turn on the piece has moved - makes
		//sure the pieces hasCaptured() returns to false false
		hasCaptured = false;
	}
}
