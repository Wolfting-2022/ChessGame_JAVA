import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo dm = new Demo();
	}

	Piece[][] board = new Piece[8][8];

	Demo() {
		// Sign pieces of white and black Pawn on the chess board

		for (int i = 0; i < board[1].length; i++) {
			board[1][i] = new Pawn(false);
			board[6][i] = new Pawn(true);
		}

		// Sign pieces of line 1 and line 8 on the board
		for (int i = 0; i < board[1].length; i++) {
			switch (i) {
			case 0:
			case 7:
				board[0][i] = new Rook(false);
				board[7][i] = new Rook(true);
				break;
			case 1:
			case 6:
				board[0][i] = new Knight(false);
				board[7][i] = new Knight(true);
				break;
			case 2:
			case 5:
				board[0][i] = new Bishop(false);
				board[7][i] = new Bishop(true);
				break;
			case 3:
				board[0][i] = new King(false);
				board[7][i] = new King(true);
				break;
			case 4:
				board[0][i] = new Queen(false);
				board[7][i] = new Queen(true);
				break;
			}

		}
		// Call method to display the initial chess board
		printBoard(board);
	}

	// print out chess board
	public void printBoard(Piece[][] arr) {
		final String MOVE = "1";
		final String CHECK = "2";
		final String REDRAW = "3";
		final String QUIT = "Q";
		String numLine = "";
		// Display the number sign on the first line
		for (int i = 1; i < 9; i++) {
			numLine += "     " + i;
		}
		System.out.println(numLine);

		// Print chess board with pieces with a number sign on the left side
		String plus = "  +";
		String bar = "  |";
		String charLine = " |";
		String s1 = "";

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				Piece piece = arr[i][j];
				plus += "-----+";
				bar += "     |";
				if (piece != null)
					s1 = "  " + piece.getSymbol() + "  |";
				else
					s1 = "     |";
				charLine += s1;
			}

			System.out.printf("%s%n", plus);
			System.out.printf("%s%n", bar);
			System.out.printf("%d%s%n", (i + 1), charLine);
			System.out.printf("%s%n", bar);
			plus = "  +";
			bar = "  |";
			charLine = " |";
		}

		// this for-loop print out bottom line
		String bottom = "  +";
		for (int i = 0; i < 8; i++) {
			bottom += "-----+";
		}
		System.out.printf("%s%n", bottom);

		boolean end = false;

		while (!end) {
			System.out.printf("%s. Move a piece. %n", MOVE);
			System.out.printf("%s. Check a piece for valid moves. %n", CHECK);
			System.out.printf("%s. Redraw the board. %n", REDRAW);
			System.out.printf("%s. Quit. %n", QUIT);
			System.out.println("Valid options are 1,2,3,or Q");

			String choice;
			Scanner keyboard = new Scanner(System.in);
			choice = keyboard.nextLine();

			// switch-case to call different method depends on users input choice
			switch (choice) {
			case MOVE:
				int[] cordi = pieceCoordinate();
				int i = cordi[0] - 1;
				int j = cordi[1] - 1;
				int m = cordi[2] - 1;
				int n = cordi[3] - 1;
				arr[m][n] = arr[i][j];
				arr[i][j] = null;
				break;
			case CHECK:
				int[] check = pieceCheck();
				int x = check[0] - 1;
				int y = check[1] - 1;
				Piece piece = arr[x][y];
				if (piece == null)
					System.out.println("there is no piece in this location.");
				else
					piece.getValidMoves(x, y);
				break;
			case REDRAW:
				printBoard(board);
				break;
			case QUIT:
				end = true;
				System.out.println("Game over. Thank you!");
				// System.out.println("Program by Dandan Cao");
				break;
			default:
				System.out.println("Valid options are 1, 2, 3 or Q.");
			}
		}
	}

	public int[] pieceCoordinate() {
		int row1, row2, col1, col2;
		int[] coordinate = new int[4];
		Scanner keyboard = new Scanner(System.in);

		/* Get valid coordinate of the chess which user want to move */
		System.out.println("What piece do you want to move?");
		System.out.println("Enter row number: ");
		row1 = keyboard.nextInt();
		keyboard.nextLine();

		while (row1 > 8 || row1 < 1) {
			System.out.println("Valid row numbers are from 1 to 8");
			System.out.println("Enter row number: ");
			row1 = keyboard.nextInt();
			keyboard.nextLine();
		}
		coordinate[0] = row1;

		/* Get valid coordinate of the chess which user want to move */
		System.out.println("Enter column number: ");
		col1 = keyboard.nextInt();
		keyboard.nextLine();
		while (col1 > 8 || col1 < 1) {
			System.out.println("Valid column numbers are from 1 to 8");
			System.out.println("Enter column number: ");
			col1 = keyboard.nextInt();
			keyboard.nextLine();
		}
		coordinate[1] = col1;

		/* Get valid coordinate of the chess which user want to move */
		System.out.println("Where do you wish to move this piece?");
		System.out.println("Enter row number: ");
		row2 = keyboard.nextInt();
		keyboard.nextLine();
		while (row2 > 8 || row2 < 1) {
			System.out.println("Valid row numbers are from 1 to 8");
			System.out.println("Enter row number: ");
			row2 = keyboard.nextInt();
			keyboard.nextLine();
		}
		coordinate[2] = row2;

		/* Get valid coordinate of the chess which user want to move */
		System.out.println("Enter column number: ");
		col2 = keyboard.nextInt();
		keyboard.nextLine();
		while (col2 > 8 || col2 < 1) {
			System.out.println("Valid column numbers are from 1 to 8");
			System.out.println("Enter column number: ");
			col2 = keyboard.nextInt();
			keyboard.nextLine();
		}
		coordinate[3] = col2;
		return coordinate;
	}

	/*
	 * print out the valid move to locations of the chess which users want to know.
	 */
	public int[] pieceCheck() {
		int row1, col1;
		Scanner keyboard = new Scanner(System.in);
		int[] checkCo = new int[2];
		System.out.println("Enter row number: ");
		row1 = keyboard.nextInt();
		keyboard.nextLine();
		while (row1 > 8 || row1 < 1) {
			System.out.println("Valid row numbers are from 1 to 8");
			System.out.println("Enter row number: ");
			row1 = keyboard.nextInt();
			keyboard.nextLine();
		}
		checkCo[0] = row1;

		// users input the location of the chess which they choose
		System.out.println("Enter column number: ");
		col1 = keyboard.nextInt();
		keyboard.nextLine();

		while (col1 > 8 || col1 < 1) {
			System.out.println("Valid column numbers are from 1 to 8");
			System.out.println("Enter column number: ");
			col1 = keyboard.nextInt();
			keyboard.nextLine();
		}
		checkCo[1] = col1;
		return checkCo;
	}
}
