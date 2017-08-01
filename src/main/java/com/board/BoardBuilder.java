package com.board;

/**
 * Created by yulia on 28.07.17.
 */
public class BoardBuilder {

    public int[][] createArray(){
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
        return matrix;
    }

    public int[][] buildBoard() {
        int[][] matrix = createArray();
        BoardEditor editor = new BoardEditor();
        editor.randomShuffle(matrix);
        if(editor.isSolvable(matrix)){
            return matrix;
        }
        return buildBoard();
    }

}
