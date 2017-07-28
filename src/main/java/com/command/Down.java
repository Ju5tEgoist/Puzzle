package com.command;


import com.Action;

/**
 * Created by yulia on 28.07.17.
 */
public class Down extends AbstractCommand {
    @Override
    public boolean canProcess(Action action) {
        return Action.DOWN == action;
    }

    @Override
    public int[][] process(int[][] board, int i, int j) {
        super.process(board, i, j);
        int value = board[i][j];
        board[i][j] = board[i + 1][j];
        board[i + 1][j] = value;
        return board;
    }

    @Override
    public boolean isOutOfBoard(int[][] board, int i, int j) {
        return i >= board.length - 1;
    }
}

