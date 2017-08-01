package com.command;


import com.Action;
import com.GameManager;
import com.board.BoardPresenter;

import java.util.Scanner;

/**
 * Created by yulia on 28.07.17.
 */
public class CommandManager {
    private BoardPresenter presenter = new BoardPresenter();

    public void redirect(int[][] board, int i, int j){
        GameManager gameManager = new GameManager();
        Command[] commands = new Command[]{
                new Up(),
                new Down(),
                new Left(),
                new Right(),
                new Help(),
                new StartGame()
        };
        Action action = getAction();
        for (Command command : commands) {
            if (command.canProcess(action))
            {
                board = command.process(board, i, j);
                gameManager.winningCase(board);
            }
        }
        presenter.display(board);
        int[] emptyCoordinates = gameManager.findEmptyCell(board);
        redirect(board, emptyCoordinates[0], emptyCoordinates[1]);
    }

    Action getAction() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        switch (s){
            case "w":  return Action.UP;
            case "s":  return Action.DOWN;
            case "a":  return Action.LEFT;
            case "d":  return Action.RIGHT;
            case "help":  return Action.HELP;
            case "start":  return Action.START;
            default: return null;
        }
    }
}
