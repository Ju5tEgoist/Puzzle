package com;

import com.command.CommandManager;

/**
 * Created by yulia on 27.07.17.
 */
public class Main {

    public static void main(String[] args) {
        CommandManager commandManager = new CommandManager();
        System.out.println("Hi, glad to see you! If you want to know about this game " +
                "enter help in your command line or start play after enter start ");
        commandManager.redirect(null, 0, 0);
    }
}
