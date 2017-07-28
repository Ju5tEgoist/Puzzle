package com.board;


import com.GameManager;

/**
 * Created by yulia on 28.07.17.
 */
public class BoardPresenter {

    private GameManager gameManager = new GameManager();

    public void display(int[][] matrix){

        for (int[] aMatrix : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                displayPretty(aMatrix[j]);
            }
            System.out.println("\n" + "--------------");
        }
        gameManager.findEmptyCell(matrix);
    }

    private void displayPretty(int element) {
        if(element >= 10){
            System.out.print(element + "| ");
        }
        else if (element == 0){
            System.out.print("  | ");
        }
        else {
            System.out.print(element + " | ");
        }
    }
}
