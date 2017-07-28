package com.command;
import com.CustomInputStream;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by yulia on 28.07.17.
 */
public class CommandLimitTest {

    private CustomInputStream in;
    private CommandManager manager;
    private Down down;
    private Right right;
    private Up up;
    private Left left;

    int[][] arrLimitDownAndRight = {{1, 2, 3, 4},
                                    {5, 6, 7, 8},
                                    {9, 10, 11, 12},
                                    {13, 14, 15, 0}};

    int[][] arrLimitUpAndLeft = {{0, 2, 3, 4},
                                {5, 6, 7, 8},
                                {9, 10, 11, 12},
                                {13, 14, 15, 1}};


    @Before
    public void setup() {
        in = new CustomInputStream();
        manager = new CommandManager();
        System.setIn(in);
        down = new Down();
        right = new Right();
        up = new Up();
        left = new Left();
    }

    @Test
    public void shouldBeBeyondTheLimitDOWN(){
        assertTrue(down.isOutOfBoard(arrLimitDownAndRight, 3,3));
    }

    @Test
    public void shouldBeBeyondTheLimitRight(){
        assertTrue(right.isOutOfBoard(arrLimitDownAndRight, 3,3));
    }

    @Test
    public void shouldBeBeyondTheLimitUp(){
        assertTrue(up.isOutOfBoard(arrLimitUpAndLeft, 0,0));
    }

    @Test
    public void shouldBeBeyondTheLimitLeft(){
        assertTrue(left.isOutOfBoard(arrLimitUpAndLeft, 0,0));
    }
}
