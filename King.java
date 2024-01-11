
public class King extends Piece {

	King(boolean isBlack) {
		super(isBlack);
	}

	@Override
	public String getSymbol() {
		// TODO Auto-generated method stub
		if (black)
			letter = "K";
		else
			letter = "k";
		return letter;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		if (black)
			name = "black King";
		else
			name = "white King";
		return name;
	}

	@Override
	public void getValidMoves(int row, int col) {
		// TODO Auto-generated method stub
		System.out.println("The piece at that location is a " + getName());
		System.out.println("Valid moves are: ");
		if ((row - 1) >= 0 && (col - 1) >= 0) {
			System.out.print(row + "," + col + " ");
		}
		if ((row - 1) >= 0 && col >= 0 && col < 8) {
			System.out.print(row + "," + (col + 1) + " ");
		}
		if ((row - 1) >= 0 && (col + 1) < 8) {
			System.out.print(row + "," + (col + 2) + " ");
		}
		if (row >= 0 && row < 8 && (col - 1) >= 0) {
			System.out.print((row + 1) + "," + (col) + " ");
		}
		if (row >= 0 && row < 8 && (col + 1) < 8) {
			System.out.print((row + 1) + "," + (col + 2) + " ");
		}
		if ((row + 1) < 8 && (col - 1) >= 0) {
			System.out.print((row + 2) + "," + (col) + " ");
		}
		if ((row + 1) < 8 && col >= 0 && col < 8) {
			System.out.print((row + 2) + "," + (col + 1) + " ");
		}
		if ((row + 1) < 8 && (col + 1) < 8) {
			System.out.print((row + 2) + "," + (col + 2) + " ");
		}
		System.out.println();
	}

}
