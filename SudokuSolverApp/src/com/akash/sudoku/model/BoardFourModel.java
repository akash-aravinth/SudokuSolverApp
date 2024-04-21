package com.akash.sudoku.model;

import com.akash.sudoku.design.BoardFour;
import com.akash.sudoku.view.BoardFourView;

public class BoardFourModel {
    private BoardFourView boardFourView;
    public BoardFourModel(BoardFourView boardFourView){
        boardFourView = this.boardFourView;
    }

    public void addValues(int rowVal, int colVal, int value, BoardFour boardFour) {
        if ((rowVal < boardFour.getRow() && rowVal >= 0) && (colVal < boardFour.getCol() && colVal >= 0) && (value > 0 && value <5)){
            boardFour.setValue(rowVal,colVal,value);
        }else {
            boardFourView.showAlert("Please Enter Valid Inputs");
        }
    }
}
