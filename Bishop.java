
public class Bishop extends Piece {

	// To be used create instance with boolean value to be identified colour black
	// or white
	Bishop(boolean isBlack) {
		super(isBlack);
	}

	@Override
	public String getSymbol() {
		// TODO Auto-generated method stub
		if (black)
			letter = "B";
		else
			letter = "b";
		return letter;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		if (black)
			name = "black Bishop";
		if (!black)
			name = "white Bishop";
		return name;
	}

	@Override
	public void getValidMoves(int row, int col) {
		// TODO Auto-generated method stub
		System.out.println("The piece at that location is a " + getName());
		int i = row + 1;
		int j = col + 1;
		String validMoves = "";

		// valid location at the left-up diagonal location of the chess Bishop
		while (i > 1 && j > 1) {
			i--;
			j--;
			validMoves += i + "," + j + " ";
		}

		System.out.print(validMoves);
		i = row + 1;
		j = col + 1;
		validMoves = "";

		// valid location at the right-up diagonal location of the chess Bishop
		while (i > 1 && j < 8) {
			i--;
			j++;
			validMoves += i + "," + j + " ";
		}

		System.out.print(validMoves);
		i = row + 1;
		j = col + 1;
		validMoves = "";

		// valid location at left-down diagonal location of the chess Bishop
		while (i < 8 && j > 1) {
			i++;
			j--;
			validMoves += i + "," + j + " ";
		}
		System.out.print(validMoves);
		i = row + 1;
		j = col + 1;
		validMoves = "";

		// valid location at right-down diagonal location of the chess Bishop
		while (i < 8 && j < 8) {
			i++;
			j++;
			validMoves += i + "," + j + " ";
		}
		System.out.print(validMoves);

	}

}
