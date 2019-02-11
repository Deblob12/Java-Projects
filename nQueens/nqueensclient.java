import java.util.*;
public class nqueensclient {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Value of n: ");
		int n = scan.nextInt();
		int[][] board = new int[n][n];
		for (int i = 0; i < n; i++) {
			Arrays.fill(board[i], 0);
		}
		int count = nqueens.recPlace(board, 0, n);
		System.out.println(count);
	}
}