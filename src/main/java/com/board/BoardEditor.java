package com.board;

import java.util.Random;

/**
 * Created by yulia on 28.07.17.
 */
public class BoardEditor {

    public int[][] randomShuffle(int[][] matrix){
        Random rnd = new Random();
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = 0; j < matrix.length; j++) {
                int indexRow = rnd.nextInt(i + 1);
                int indexColumn = rnd.nextInt(j + 1);
                // Simple swap
                int a = matrix[indexRow][indexColumn];
                matrix[indexRow][indexColumn] = matrix[i][j];
                matrix[i][j] = a;
            }
        }
        return matrix;
    }

//    Обозначим через n количество инверсий в этой перестановке (т.е. количество таких элементов
// a_i и a_j, что i < j, но a_i > a_j). Далее, пусть k — номер строки, в которой находится пустой
// элемент.Решение существует тогда и только тогда, когда n+k чётно.

    public boolean isSolvable(int[][] matrix){
        int n = 0;
        int k = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][j] == 0){
                    k += i;
                }
                for (int l = i; l < matrix.length; l++) {
                    int initialIndex = j;
                    if(l != i){
                        initialIndex = 0;
                    }
                    for (int m = initialIndex; m < matrix.length; m++) {
                        if (matrix[i][j] > matrix[l][m] && matrix[l][m] != 0) {
                            n++;
                        }
                    }
                }
            }
        }
        return (n+k) % 2 == 0;
    }
}
