//this script is the basis of unit testing for the piece class

import java.util.Objects;

public class PieceTest {

	public static int numtests = 0;
	public static int numpass = 0;

	public static void testisFire() {
		board b = new board();
		Piece pTest = new Piece(true, b, 2, 2, "pawn");
		boolean firecheck = pTest.isFire();
		Piece pTest2 = new Piece(false,b,1,2,"pawn");
		boolean firecheck2 = pTest.isFire();
		if( Objects.deepEquals(true,firecheck) == false|| Objects.deepEquals(false,firecheck) == false) {
			numpass = numpass - 1;
			System.out.println("IsFire Failed");
		}
		numtests = numtests + 1;
		numpass = numpass + 1;
	}


	public static void main(String[] args) {
		testisFire();
		System.out.println(numpass + " of " + numtests + " tests passed.");
	}

}