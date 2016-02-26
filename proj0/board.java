public class board {


	private static int N;
	// my thinking is to create a matrix of pieces (n by n) which is initialized
	// with null values at first, then filled as pieces are placed 
	// initial implementation will probably place pieces one by one using place()
    private static Piece[][] pieceset;
    private static Piece[] fireset;
    private static Piece iceset;
    private int piecetot = 0;  // total number of pieces on board
    
	public board(boolean shouldBeEmpty){
		//setting size
		N = 8;
		shouldBeEmpty=shouldBeEmpty;

	}
	
	// to be initialized at start of game
	// draws the board itself
	private static void drawBoard(){
	    for (int i = 0; i < N; i += 1) {
	        for (int j = 0; j < N; j +=1) {
	            if (i + j % 2 == 0) {
	                //set the color to red
	            } else {
	                //set the color to grey
	            }
	        }
	        pieceset = new Piece[N][N];
	    }
	}
	
	//starts a standard version of the game
	// 3 rows of pieces top n bottom
	private static void newGameStd(){
	    //12 pieces total - can't gain pieces in checkz
	    //nevermind - going to go the manual route
	    //fireset = new Piece[12];
	    //waterset = new Piece[12];
        wpawn1 = new 
	    }
	}
	
	public static void main(String[] args){
		//starts a gui version of the game

	}

	private Piece pieceAt(int x, int y) {
		//gets the piece at position (x,y) on the board
		//or null if there is no piece
		// if x,y are out of bounds, returns null
        return null;
	}

	private boolean canSelect(int x, int y) {
		//returns true if the square at (x,y can be selected)

		/** a square can be celected if it is the player's turn and:
				-player has not selected a piece yet
				-player has selected a piece but did not move it**/
		/** an empty squre may be selected if:
				-during turn, player has selected a piece that hasn't
				moved and is selecting a valid move for the piece
				-during turn, player selected a piece, captured, and has
				selectd another valid caputure destination - during the 
				multi-capture, you should only select the active piece 
				once - all other slections must be valid destination points**/
		return true;
	}

	private void select(int x, int y){
		//selects teh square at (x,y) - this method assumes canSelect(x,y)
		//returns true -  optionally, it is recommended to color the 
		//background white on the selected square
	}

	private void place(Piece p, int x, int y) {
		//places p at (x,y)
		// if (x,y) is out of bounds or p is null, does nothing
		// if another piece exists at (x,y) p will replace that piece
		//	^ above is useful for creating test circumstances
	}

	private Piece remove(int x, int y) {
		//executes a remove - returns the piece that was removed
		// if the input is out of bounds, returns null and prints a message
		// if no piece at x,y, returns null and prints a message
		return null;
	}

	private boolean canEndTurn() {
		//returns whether or not the player can end their turn
		//must have moved of performed a capture
		return true;

	}

	private void endTurn() {
		//called at end of each turn - handles switching of players 
		//and anything else that happens @ endturn
	}

	private String winner() {
		// returns the winner of teh game - fire, water, no one, or null
        return null;
	}

}