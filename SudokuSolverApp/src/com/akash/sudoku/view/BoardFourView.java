package com.akash.sudoku.view;

import com.akash.sudoku.design.BoardFour;
import com.akash.sudoku.model.BoardFourModel;
import com.akash.sudoku.model.SolveBoard;

import java.util.Scanner;

public class BoardFourView {
    Scanner scanner = new Scanner(System.in);
    private BoardFourModel boardFourModel;
    public BoardFourView(){
        boardFourModel = new BoardFourModel(this);
    }

    public void insertValue(BoardFour boardFour) {
        boolean temp = true;
        System.out.println("Please Enter the Row Column Value Between 0 - 8 ");
        while (temp){
            System.out.println("Do You Want Exit then Enter 0 ");
            int exit = scanner.nextInt();
            if (exit == 0){
                SolveBoard solveBoard = new SolveBoard();
                solveBoard.solveBoard(boardFour.getBoard());
                solveBoard.printBoard(boardFour.getBoard());
                showAlert("ThankYou");
                temp = false;
            }else {
                System.out.println("Enter Which row you want add Value : ");
                int rowVal = scanner.nextInt();
                System.out.println("Enter Which column you want add Value : ");
                int colVal = scanner.nextInt();
                System.out.println("Enter the insert Value : ");
                int value = scanner.nextInt();
                boardFourModel.addValues(rowVal,colVal,value,boardFour);
            }
        }
    }

    public void showAlert(String thankYou) {
        System.out.println(thankYou);
    }
}
