package com.akash.sudoku.model;

import com.akash.sudoku.view.SetupView;

public class SetupModel {

    private SetupView setupView;
    public SetupModel(SetupView setupView) {
        setupView = this.setupView;
    }

    public boolean checkBoard(int boardSize) {
        if (boardSize == 4 || boardSize == 9){
            return true;
        }
        return false;
    }
}
