package com;


import com.command.CommandManager;

/**
 * Created by yulia on 28.07.17.
 */
public class GameManager {

    private Exit exit = new Exit();

    public int[] findEmptyCell(int[][] matrix) {
        int[] emptyCellCoordinates = new int[2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][j] == 0){
                    emptyCellCoordinates[0] = i;
                    emptyCellCoordinates[1] = j;
                }
            }
        }
        return emptyCellCoordinates;
    }

    public void winningCase(int[][] board) {
        int size = 4;
        int value = 0;
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(value <= 14) {
                    matrix[i][j] = ++value;
                }
            }
        }
        if(isArraysEquals(board, matrix)){
            System.out.println("Congratulation! You win!");
            exit.closeProgram();
        }
    }

    public boolean isArraysEquals(int[][] board, int[][] matrix) {

        boolean answer = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][j] != board[i][j]){
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }
}

