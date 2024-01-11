
public abstract class Piece {

	// This boolean value indicate colour black when true, colour white when false
	protected boolean black = true;
	protected String name;
	protected String letter;

	public Piece() {
	}

	// Allow create instructor by boolean value to varify colour black or white
	public Piece(boolean isblack) {
		this.black = isblack;
	}

	public abstract void getValidMoves(int row, int col);

	public abstract String getSymbol();

	public abstract String getName();

}
