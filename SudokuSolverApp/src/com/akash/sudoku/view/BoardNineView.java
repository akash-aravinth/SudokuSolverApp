package com.akash.sudoku.view;

import com.akash.sudoku.design.BoardNine;
import com.akash.sudoku.model.BoardNineModel;
import com.akash.sudoku.model.SolveBoard;

import java.util.Scanner;

public class BoardNineView {
    Scanner scanner = new Scanner(System.in);
    private BoardNineModel boardNineModel;
    public BoardNineView(){
        boardNineModel = new BoardNineModel(this);
    }

    public void insertValue(BoardNine boardNine) {
        boolean temp = true;
        System.out.println("Please Enter the Row Column Value Between 0 - 8 ");
        while (temp){
            System.out.println("Do You Want Exit then Enter 0 ");
            int exit = scanner.nextInt();
            if (exit == 0){
                SolveBoard solveBoard = new SolveBoard();
                solveBoard.solveBoard(boardNine.getBoard());
                //boardNineModel.customInsert(boardNine);
                solveBoard.printBoard(boardNine.getBoard());
                showAlert("ThankYou");
                temp = false;
            }else {
                System.out.println("Enter Which row you want add Value : ");
                int rowVal = scanner.nextInt();
                System.out.println("Enter Which column you want add Value : ");
                int colVal = scanner.nextInt();
                System.out.println("Enter the insert Value : ");
                int value = scanner.nextInt();
                boardNineModel.addValues(rowVal,colVal,value,boardNine);
            }
        }
    }
    public void showAlert(String s){
        System.out.println(s);
    }


}
