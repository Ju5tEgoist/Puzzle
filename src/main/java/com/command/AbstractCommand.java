package com.command;

/**
 * Created by yulia on 28.07.17.
 */
public abstract class AbstractCommand implements Command {

    private CommandManager commandManager = new CommandManager();
    @Override
    public int[][] process(int[][] board, int i, int j) {
        if(isOutOfBoard(board, i, j)) {
            System.out.println("Invalid command");
            commandManager.redirect(board, i, j);
        }
        return board;
    }
}
