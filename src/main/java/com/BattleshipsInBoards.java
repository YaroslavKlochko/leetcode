package com.example;

//Given an m x n matrix board where each cell is a battleship 'X' or empty '.', return the number of the battleships on board.
//Battleships can only be placed horizontally or vertically on board. In other words,
//they can only be made of the shape 1 x k (1 row, k columns) or k x 1 (k rows, 1 column), where k can be of any size.
//At least one horizontal or vertical cell separates between two battleships (i.e., there are no adjacent battleships).

// check base case
// create a box for result
// go through each element horizontally and vertically
// check if it is a ship
// if it is a ship check around the ship
// create base cases for the board
// create a starting point
// expand your search


public class BattleshipsInBoards {

    public int countBattleships(char[][] board) {
        if(board == null || board.length == 0) {
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
