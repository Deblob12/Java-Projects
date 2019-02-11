import java.util.*;
public class nqueens {
	public static int count = 0;
	public static boolean placeable(int[][] board, int row, int col, int n) {
		for (int i = 0; i < col; i++) {
			if (board[row][i] == 1) {
				return false;
			}
		}
		for (int delta = 0; (row + delta < n && col - delta >= 0); delta++) {
			if (board[row + delta][col - delta] == 1) {
				return false;
			}
		}

		for (int delta = 0; (row - delta >= 0 && col - delta >= 0); delta++) {
			if (board[row-delta][col-delta] == 1) {
				return false;
			}
		}

		return true;
	}

	public static int recPlace(int[][] board, int col, int n) {
		if (col == n) {
			count++;
		}
		for (int i = 0; i < n; i ++) {
			if (placeable(board, i, col, n)) {
				board[i][col] = 1;
				recPlace(board, col + 1, n);
				board[i][col] = 0;
			}
		}
		return count;
	}

}