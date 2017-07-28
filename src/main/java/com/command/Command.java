package com.command;


import com.Action;

/**
 * Created by yulia on 28.07.17.
 */
public interface Command {

    boolean canProcess(Action action);
    int[][] process(int[][] board, int i, int j);
    boolean isOutOfBoard(int[][] board, int i, int j);
}
