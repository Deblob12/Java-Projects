public class Sudoku {
	public static boolean placeable(int[][] board, int number, int row, int column) {
		for (int i = 0; i < board.length; i++) {
			if (board[i][column] == number) {
				return false;
			}
		}
		for (int j = 0; j < board[row].length; j++) {
			if (board[row][j] == number) {
				return false;
			}
		}
		row = row - (row % 3);
		column = column - (column % 3);
		for (int k = 0; k < 3; k++) {
			for (int l = 0; l < 3; l++) {
				if (board[row + k][column + l] == number) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean solve(int[][] board) {
		int row = -1;
		int col = -1;
		boolean done = true;
		for (int i = 0 ; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 0) {
					row = i;
					col = j;
					done = false;
					break;
				}

			}
			if (!done) {
				break;
			}
		}
		if (done) {
			printBoard(board);
			return true;
		}
		for (int k = 1; k <= 9; k++) {
			if (placeable(board,k,row,col)) {
				board[row][col] = k;
				if (solve(board) == true) {
					return true;
				}
				else {
					board[row][col] = 0;
				}
			}
		}
		return false;
	}

	private static void printBoard(int[][] board) {
		System.out.println("-------------------------------");
		System.out.printf("| %d, %d, %d | %d, %d, %d | %d, %d, %d |\n", board[0][0],board[0][1],board[0][2],
				board[0][3],board[0][4],board[0][5],board[0][6],board[0][7],board[0][8]);
		System.out.printf("| %d, %d, %d | %d, %d, %d | %d, %d, %d |\n", board[1][0],board[1][1],board[1][2],
				board[1][3],board[1][4],board[1][5],board[1][6],board[1][7],board[1][8]);
		System.out.printf("| %d, %d, %d | %d, %d, %d | %d, %d, %d |\n", board[2][0],board[2][1],board[2][2],
				board[2][3],board[2][4],board[2][5],board[2][6],board[2][7],board[2][8]);
		System.out.println("-------------------------------");
		System.out.printf("| %d, %d, %d | %d, %d, %d | %d, %d, %d |\n", board[3][0],board[3][1],board[3][2],
				board[3][3],board[3][4],board[3][5],board[3][6],board[3][7],board[3][8]);
		System.out.printf("| %d, %d, %d | %d, %d, %d | %d, %d, %d |\n", board[4][0],board[4][1],board[4][2],
				board[4][3],board[4][4],board[4][5],board[4][6],board[4][7],board[4][8]);
		System.out.printf("| %d, %d, %d | %d, %d, %d | %d, %d, %d |\n", board[5][0],board[5][1],board[5][2],
				board[5][3],board[5][4],board[5][5],board[5][6],board[5][7],board[5][8]);
		System.out.println("-------------------------------");
		System.out.printf("| %d, %d, %d | %d, %d, %d | %d, %d, %d |\n", board[6][0],board[6][1],board[6][2],
				board[6][3],board[6][4],board[6][5],board[6][6],board[6][7],board[6][8]);
		System.out.printf("| %d, %d, %d | %d, %d, %d | %d, %d, %d |\n", board[7][0],board[7][1],board[7][2],
				board[7][3],board[7][4],board[7][5],board[7][6],board[7][7],board[7][8]);
		System.out.printf("| %d, %d, %d | %d, %d, %d | %d, %d, %d |\n", board[8][0],board[8][1],board[8][2],
				board[8][3],board[8][4],board[8][5],board[8][6],board[8][7],board[8][8]);
		System.out.println("-------------------------------");
	}
}