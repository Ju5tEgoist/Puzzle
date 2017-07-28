package com.command;

import com.Action;
import com.board.BoardBuilder;

/**
 * Created by yulia on 28.07.17.
 */
public class Help extends AbstractCommand {

    private BoardBuilder builder = new BoardBuilder();
    @Override
    public boolean canProcess(Action action) {
        return Action.HELP == action;
    }

    @Override
    public int[][] process(int[][] board, int i, int j) {
        System.out.println("More about game structure you can read here --> https://en.wikipedia.org/wiki/15_puzzle " +
                "\n Available keys to move empty cell" +
                "\n w - move cell up" +
                "\n s - move cell down" +
                "\n a - move cell left" +
                "\n d - move cell right");
        return builder.createArray();
    }

    @Override
    public boolean isOutOfBoard(int[][] board, int i, int j) {
        return false;
    }
}
