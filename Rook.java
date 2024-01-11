
public class Rook extends Piece {

	Rook(boolean isBlack) {
		super(isBlack);
	}

	@Override
	public String getSymbol() {
		// TODO Auto-generated method stub
		if (black)
			letter = "R";
		else
			letter = "r";
		return letter;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		if (black)
			name = "black Rook";
		else
			name = "white Rook";
		return name;
	}

	@Override
	public void getValidMoves(int row, int col) {
		// TODO Auto-generated method stub
		String s1 = "";
		String s2 = "";

		System.out.println("The piece at that location is a " + getName());
		System.out.println("Valid moves are: ");

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

	}
}
