package com.command;


import com.Action;

/**
 * Created by yulia on 28.07.17.
 */
public class Left extends AbstractCommand {
    @Override
    public boolean canProcess(Action action) {
        return Action.LEFT == action;
    }

    @Override
    public int[][] process(int[][] board, int i, int j) {
        super.process(board, i, j);
        int value = board[i][j];
        board[i][j] = board[i][j - 1];
        board[i][j - 1] = value;
        return board;
    }

    @Override
    public boolean isOutOfBoard(int[][] board, int i, int j) {
        return j <= 0;
    }
}

