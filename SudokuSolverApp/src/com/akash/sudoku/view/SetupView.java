package com.akash.sudoku.view;

import com.akash.sudoku.design.BoardFour;
import com.akash.sudoku.design.BoardNine;
import com.akash.sudoku.model.SetupModel;

import java.util.Scanner;

public class SetupView {
    Scanner scanner = new Scanner(System.in);
    private SetupModel setupModel;
    public SetupView(){
        setupModel = new SetupModel(this);
    }

    public void init() {
        System.out.println("Here You Can Play 4*4 Board and 9*9 Board");
        System.out.println("Please Enter 4 For 4*4 Board or \nPlease Enter 9 For 9*9 Board");
        int boardSize = scanner.nextInt();
        if(setupModel.checkBoard(boardSize)){
            createBoard(boardSize);
        }else {
            showAlert("Please Enter Valid Board Size");
            init();
        }
    }

    private void createBoard(int boardSize) {
        if (boardSize == 4){
            BoardFour boardFour = new BoardFour();
            BoardFourView boardFourView = new BoardFourView();
            boardFourView.insertValue(boardFour);
        }else if (boardSize == 9){
            BoardNine boardNine = new BoardNine();
            BoardNineView boardNineView = new BoardNineView();
            boardNineView.insertValue(boardNine);
        }else {
            showAlert("Please Enter Valid Board Size");
            init();
        }
    }

    public void showAlert(String s){
        System.out.println(s);
    }
}
