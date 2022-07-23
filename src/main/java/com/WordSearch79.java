public class WordSearch79 {

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == word.charAt(0) && dfs(board, i, j, 0, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, int row, int column, int foundLetters, String targetWord) {
        if (foundLetters == targetWord.length()) {
            return true;
        }
        if (row < 0 || row >= board.length || column < 0 || column >= board[row].length || board[row][column] != targetWord.charAt(foundLetters)) {
            return false;
        }
        char temp = board[row][column];
        board[row][column] = ' ';
        boolean found = dfs(board, row + 1, column, foundLetters + 1, targetWord) ||
                dfs(board, row - 1, column, foundLetters + 1, targetWord) ||
                dfs(board, row, column + 1, foundLetters + 1, targetWord) ||
                dfs(board, row, column - 1, foundLetters + 1, targetWord);
        board[row][column] = temp;
        return found;
    }
}
