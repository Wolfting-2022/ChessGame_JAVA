
public class Knight extends Piece {

	// To be used create instance with boolean value to be identified colour black
	// or white
	Knight(boolean isBlack) {
		super(isBlack);
	}

	@Override
	public String getSymbol() {
		// TODO Auto-generated method stub
		if (black)
			letter = "N";
		else
			letter = "n";
		return letter;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		if (black)
			name = "black Knight";
		if (!black)
			name = "white Knight";
		return name;
	}

	@Override
	public void getValidMoves(int row, int col) {
		// TODO Auto-generated method stub
		System.out.println("The piece at that location is a " + getName());

		if (row - 1 >= 0 && col - 2 >= 0) {
			System.out.print((row) + "," + (col - 1) + " ");
		}
		if (row - 2 >= 0 && col - 1 >= 0) {
			System.out.print((row - 1) + "," + (col) + " ");
		}
		if (row - 2 >= 0 && col + 1 < 8) {
			System.out.print((row - 1) + "," + (col + 2) + " ");
		}
		if (row - 1 >= 0 && col + 2 < 8) {
			System.out.print(row + "," + (col + 3) + " ");
		}
		if (row + 1 < 8 && col - 2 >= 0) {
			System.out.print((row + 2) + "," + (col - 1) + " ");
		}
		if (row + 2 < 8 && col - 1 >= 0) {
			System.out.print((row + 3) + "," + (col) + " ");
		}
		if (row + 2 < 8 && col + 1 < 8) {
			System.out.print((row + 3) + "," + (col + 2) + " ");
		}
		if (row + 1 < 8 && col + 2 < 8) {
			System.out.print((row + 2) + "," + (col + 3) + " ");
		}
		System.out.println();
	}

}
