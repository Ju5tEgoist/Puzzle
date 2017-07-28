package com.command;

import com.GameManager;
import com.command.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by yulia on 28.07.17.
 */
public class CommandProcessTest {

    private GameManager gameManager;
    private Down down;
    private Right right;
    private Up up;
    private Left left;

    int[][] testArray = {{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 0, 11, 12},
                        {13, 14, 15, 10}};
    @Before
    public void setup() {
        down = new Down();
        right = new Right();
        up = new Up();
        left = new Left();
        gameManager = new GameManager();
    }

    @Test
    public void arraysShouldBeEqualsAfterDown(){
        int[][] testArrayDown = {{1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 14, 11, 12},
                            {13, 0, 15, 10}};
        assertTrue(gameManager.isArraysEquals(down.process(testArray, 2,1), testArrayDown));
    }

    @Test
    public void arraysShouldBeEqualsAfterRight(){
        int[][] testArrayRight = {{1, 2, 3, 4},
                                {5, 6, 7, 8},
                                {9, 11, 0, 12},
                                {13, 14, 15, 10}};
        assertTrue(gameManager.isArraysEquals(right.process(testArray, 2,1), testArrayRight));
    }

    @Test
    public void arraysShouldBeEqualsAfterUp(){
        int[][] testArrayUp = {{1, 2, 3, 4},
                            {5, 0, 7, 8},
                            {9, 6, 11, 12},
                            {13, 14, 15, 10}};
        assertTrue(gameManager.isArraysEquals(up.process(testArray, 2,1), testArrayUp));
    }

    @Test
    public void arraysShouldBeEqualsAfterLeft(){
        int[][] testArrayLeft = {{1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {0, 9, 11, 12},
                            {13, 14, 15, 10}};
        assertTrue(gameManager.isArraysEquals(left.process(testArray, 2,1), testArrayLeft));
    }





}
