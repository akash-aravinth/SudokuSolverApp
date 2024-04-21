package com.akash.sudoku.design;

public class BoardFour {
    private final int row = 4;
    private final int col = 4;

    private final int gridSize = 3;
    int board[][];
    public BoardFour(){
        board = new int[row][col];
    }

    public int[][] getBoard() {
        return board;
    }
    public void setValue(int rowVal,int colVal,int val){
        board[rowVal][colVal] = val;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int getGridSize() {
        return gridSize;
    }
}
