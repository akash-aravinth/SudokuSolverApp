package com.akash.sudoku;

import com.akash.sudoku.view.SetupView;

public class SudokuSolver {
    private String appName = "Sudoku Solver";
    private String appVersion = "0.0.1";
    public String getAppName() {
        return appName;
    }
    public String getAppVersion() {
        return appVersion;
    }
    private static SudokuSolver sudokuSolver;
    public static SudokuSolver getInstance(){
        if (sudokuSolver == null){
            sudokuSolver = new SudokuSolver();
        }
        return sudokuSolver;
    }
    public void init(){
        System.out.println("Welcome To "+getAppName());
        System.out.println("Version id : "+getAppVersion());
        SetupView setupView = new SetupView();
        setupView.init();
    }

    public static void main(String[] args) {
        getInstance().init();
    }
}
