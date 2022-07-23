// check base case
// create a box for result
// go through each element horizontally and vertically
// check if it is a ship
// if it is a ship check around the ship
// create base cases for the board
// create a starting point
// expand your search

public class BattleshipsInBoards419 {
    public int countBattleships(char[][] board) {
        if (board == null || board.length == 0) {
            return 0;
        }
        int amountOfShips = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'X') {
                    amountOfShips++;
                    sink(board, i, j);
                }
            }
        }
        return amountOfShips;
    }

    void sink(char[][] board, int i, int j) {
        if (i < 0 || i > board.length || j < 0 || j > board[i].length || board[i][j] != 'X') {
            return;
        }
        board[i][j] = '.';
        sink(board, i + 1, j);
        sink(board, i - 1, j);
        sink(board, i, j + 1);
        sink(board, i, j - 1);
    }
}