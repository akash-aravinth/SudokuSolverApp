package com.akash.sudoku.design;

public class BoardNine {
    private final int row = 9;
    private final int  col = 9;

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int getGridVal() {
        return gridVal;
    }

    private final int gridVal = 3;
    int board[][];
    public BoardNine(){
        board = new int[row][col];
    }

    public int[][] getBoard() {
        return board;
    }
    public void setValue(int rowVal,int colVal,int val){
        board[rowVal][colVal] = val;
    }

}
