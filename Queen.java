
public class Queen extends Piece{
	
	public Queen(boolean isBlack) {
		super(isBlack);
	}


	@Override
	public String getSymbol() {
		// TODO Auto-generated method stub
		if(black) letter = "Q";
		else letter = "q";
		return letter;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		if(black) name = "black Queen";
		else name = "white Queen";
		return name;
	}
	
	@Override
	public void getValidMoves(int row, int col) {
		// TODO Auto-generated method stub
		String s1 = "";
		String s2 = "";

		System.out.println("The piece at that location is a " + getName());
		System.out.println("Valid moves are: ");
		// These can print out the four vertical and horizental valid location of chess
		// Queen
		for (int j = 1; j < 9; j++) {
			if (j != row + 1) {
				s1 = s1 + j + "," + (col + 1) + " ";
			}
		}

		for (int i = 1; i < 9; i++) {
			if (i != col + 1) {
				s2 = s2 + (row + 1) + "," + i + " ";
			}
		}

		System.out.println(s1 + "and");
		System.out.println(s2);
		System.out.println();

		s1 = "";
		s2 = "";

		// these can print out the valid diagonal location for chess Queen
		int m = row + 1;
		int n = col + 1;
		String validMoves = "";

		// valid location at the left-up diagonal location of the chess Bishop
		while (m > 1 && n > 1) {
			m--;
			n--;
			validMoves += m + "," + n + " ";
		}

		System.out.print(validMoves);
		m = row + 1;
		n = col + 1;
		validMoves = "";

		// valid location at the right-up diagonal location of the chess Bishop
		while (m > 1 && n < 8) {
			m--;
			n++;
			validMoves += m + "," + n + " ";
		}

		System.out.print(validMoves);
		m = row + 1;
		n = col + 1;
		validMoves = "";

		// valid location at left-down diagonal location of the chess Bishop
		while (m < 8 && n > 1) {
			m++;
			n--;
			validMoves += m + "," + n + " ";
		}
		System.out.print(validMoves);
		m = row + 1;
		n = col + 1;
		validMoves = "";

		// valid location at right-down diagonal location of the chess Bishop
		while (m < 8 && n < 8) {
			m++;
			n++;
			validMoves += m + "," + n + " ";
		}
		System.out.print(validMoves);
		m = row + 1;
		m = col + 1;
		validMoves = "";
		System.out.println();
	}

}
