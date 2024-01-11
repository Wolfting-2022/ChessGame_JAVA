
public class Pawn extends Piece {


	Pawn(boolean isBlack) {
		super(isBlack);
	}

	@Override
	public String getSymbol() {
		// TODO Auto-generated method stub
		if (black)
			letter = "P";
		else
			letter = "p";
		return letter;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		if (black)
			name = "black Pawn";
		else
			name = "white Pawn";
		return name;
	}

	@Override
	public void getValidMoves(int row, int col) {
		// TODO Auto-generated method stub
		System.out.println("The piece at that location is a " + getName());
		if (row == 1 && !black) {
			System.out.println("Valid moves are: " + (row + 2) + "," + (col + 1) + " " + (row + 3) + "," + (col + 1));
		}
		if (row == 6 && black) {
			System.out.println("Valid moves are: " + (row) + "," + +(col + 1) + " " + (row - 1) + "," + (col + 1));
		}
		if (row == 0 && black || row == 7 && !black) {
			System.out.println("It is at the end of line cannot move.");
		}
		if ((row == 2 || row == 3 || row == 4 || row == 5) && !black) {
			System.out.println("Valid moves are: " + (row + 2) + "," + +(col + 1));
		}
		if ((row == 2 || row == 3 || row == 4 || row == 5) && black) {
			System.out.println("Valid moves are: " + row + "," + +(col + 1));
		}
	}
}
