package com.command;

import com.Action;
import com.board.BoardBuilder;

/**
 * Created by yulia on 28.07.17.
 */
public class StartGame extends AbstractCommand {

    private BoardBuilder builder = new BoardBuilder();

    @Override
    public boolean canProcess(Action action) {
        return Action.START == action;
    }

    @Override
    public int[][] process(int[][] board, int i, int j) {
        return builder.createArray();
    }

    @Override
    public boolean isOutOfBoard(int[][] board, int i, int j) {
        return false;
    }
}
