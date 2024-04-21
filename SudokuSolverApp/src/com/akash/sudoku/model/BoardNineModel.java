package com.akash.sudoku.model;

import com.akash.sudoku.design.BoardNine;
import com.akash.sudoku.view.BoardNineView;

public class BoardNineModel {
    private BoardNineView boardNineView;
    public BoardNineModel(BoardNineView boardNineView){
        boardNineView = this.boardNineView;
    }

    public void addValues(int rowVal, int colVal, int value, BoardNine boardNine) {
        if ((rowVal < boardNine.getRow() && rowVal >= 0) && (colVal < boardNine.getCol() && colVal >= 0) && (value > 0 && value <10)){
            boardNine.setValue(rowVal,colVal,value);
        }else {
            boardNineView.showAlert("Please Enter Valid Inputs");
        }
    }

    public void customInsert(BoardNine boardNine){
        boardNine.setValue(0,0,1);
        boardNine.setValue(0,1,2);
        boardNine.setValue(0,3,3);
        boardNine.setValue(0,5,4);
        boardNine.setValue(0,7,5);
        boardNine.setValue(0,8,6);
        boardNine.setValue(1,0,7);
        boardNine.setValue(1,5,6);
        boardNine.setValue(1,8,1);
        boardNine.setValue(3,1,8);
        boardNine.setValue(3,3,4);
        boardNine.setValue(3,5,9);
        boardNine.setValue(3,7,2);
        boardNine.setValue(4,5,6);
        boardNine.setValue(5,1,3);
        boardNine.setValue(5,3,5);
        boardNine.setValue(5,5,1);
        boardNine.setValue(5,7,8);
        boardNine.setValue(7,0,9);
        boardNine.setValue(7,3,2);
        boardNine.setValue(7,8,8);
        boardNine.setValue(8,0,8);
        boardNine.setValue(8,1,4);
        boardNine.setValue(8,3,6);
        boardNine.setValue(8,5,7);
        boardNine.setValue(8,7,1);
        boardNine.setValue(8,8,9);
    }



}
