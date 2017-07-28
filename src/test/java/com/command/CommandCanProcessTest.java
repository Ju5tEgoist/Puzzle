package com.command;

import com.Action;
import com.command.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by yulia on 28.07.17.
 */
public class CommandCanProcessTest {
    private Down down;
    private Right right;
    private Up up;
    private Left left;
    private Help help;
    private StartGame startGame;

    @Before
    public void setup() {
        down = new Down();
        right = new Right();
        up = new Up();
        left = new Left();
        help = new Help();
        startGame = new StartGame();
    }

    @Test
    public void equalsDown(){
        assertTrue(down.canProcess(Action.DOWN));
    }

    @Test
    public void equalsRight(){
        assertTrue(right.canProcess(Action.RIGHT));
    }

    @Test
    public void equalsUp(){
        assertTrue(up.canProcess(Action.UP));
    }

    @Test
    public void equalsLeft(){
        assertTrue(left.canProcess(Action.LEFT));
    }

    @Test
    public void equalsHelp(){
        assertTrue(help.canProcess(Action.HELP));
    }

    @Test
    public void equalsStart(){
        assertTrue(startGame.canProcess(Action.START));
    }
}
