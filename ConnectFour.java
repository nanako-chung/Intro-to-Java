import java.util.*;

public class ConnectFour {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[][] board=new char[6][7];
		char player = 'X';
		emptyBoard(board, '-');
		while (true) {
			printBoard(board);
			System.out.print("Player "+player+", please enter the column where you'd like to drop your next piece: ");
			int col=input.nextInt();
			if (tryDropPiece(board,col,player)) {
				if (checkForWin(board)) {
					System.out.println("Player "+player+" wins!");
					printBoard(board);
					return;
				} player=switchPlayer(player);
			}
		}
	}

	public static void emptyBoard(char[][] board, char myChar) {
		for (int row=0; row<board.length; row++) {
			for (int col=0; col<board[row].length; col++) {
				board[row][col]='-';
			}
		}
	}
	
	public static void printBoard(char[][] board) {
		System.out.println("|");
		for (int row=0; row<board.length; row++) {
			System.out.println("|");
			for (int col=0; col<board[row].length; col++) {
				System.out.println(" "+board[row][col]+"|");
			} System.out.println();
		}
	}

	public static boolean tryDropPiece(char[][] board, int col, char player) {
		boolean result = false;
		if (board[0][col]!='-') {
			System.out.println("Sorry that column is full.");
			return false;
		} 
		
		for (int row=board.length-1; row>=0; row--) {
			if (board[row][col]=='-') {
				board[row][col]=player;
				return true;
			}
		} return result;
	}

	public static boolean checkForWin(char[][] board) {
		boolean result = false;
		for (int row=0; row<board.length; row++) {
			for (int col=0; col<board[row].length-3;col++) {
				if (board[row][col]!='-' && board[row][col]==board[row][col+1] && board[row][col]==board[row][col+2] && board[row][col]==board[row][col+3]) {
					return true;
				} else if (board[row][col]!='-' && board[row][col]==board[row+1][col] && board[row][col]==board[row+2][col] && board[row][col]==board[row+3][col]) {
					return true;
				} //check for win diagonally (both from top left and from top right)
			}
		} return result;
	}

	public static char switchPlayer(char currentPlayer) {
		if (currentPlayer=='X') {
			return 'O';
		} else {
			return 'X';
		}
	}
}
