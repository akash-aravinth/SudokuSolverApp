package com.akash.sudoku.model;

public class SolveBoard {
    public boolean solveBoard(int board[][]){
        for (int row = 0;row < board.length;row++){
            for (int col = 0;col < board.length;col++){
                if (board[row][col] == 0){
                    for (int value = 1;value <=board.length;value++){
                        if (isValidBoard(board,row,col,value)){
                            board[row][col] = value;

                            if (solveBoard(board)){
                                return true;
                            }else {
                                board[row][col] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValidBoard(int[][] board, int row, int col, int value) {
        return (!rowCheck(board,row,value) && !columnCheck(board,col,value) && !gridCheck(board,row,col,value));
    }

    private boolean gridCheck(int[][] board, int row, int col, int value) {
        int boardSize = board.length;
        int grid = 0;
        if(boardSize == 9){
            grid = 3;
        }else {
            grid = 2;
        }
        int rowVal = row - row % grid;
        int colVal = col - col % grid;
        for (int i = rowVal;i<rowVal+3;i++){
            for (int j = colVal;j<colVal++;j++){
                if (board[i][j] == value){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean columnCheck(int[][] board, int col, int value) {
        for (int i =0;i<board.length;i++){
            if (board[i][col] == value){
                return true;
            }
        }
        return false;
    }

    private boolean rowCheck(int[][] board, int row, int value) {
        for (int i =0;i<board.length;i++){
            if (board[row][i] == value){
                return true;
            }
        }
        return false;
    }
    public void printBoard(int board[][]) {
        for (int i =0;i<board.length;i++){
            for (int j =0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }


}
