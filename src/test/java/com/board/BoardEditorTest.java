package com.board;

import com.GameManager;
import com.board.BoardEditor;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by yulia on 28.07.17.
 */
public class BoardEditorTest {

    private BoardEditor editor = new BoardEditor();
    GameManager gameManager = new GameManager();

    @Test
    public void shouldShuffleArray(){
        int[][] first = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 0}};
        int[][] second = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 0}};
        editor.randomShuffle(first);
        assertFalse(gameManager.isArraysEquals(first, second));
    }

    @Test
    public void shouldBeSolvableSimpleCase(){
        int[][] testArray = {{1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12},
                            {13, 14, 0, 15}};
        assertTrue(editor.isSolvable(testArray));
    }

    @Test
    public void shouldBeSolvableComplexCase(){
        int[][] testArray = {{12, 5, 8, 7},
                {4, 11, 2, 14},
                {13, 6, 1, 0},
                {10, 9, 15, 3}};
        assertTrue(editor.isSolvable(testArray));
    }

    @Test
    public void shouldBeUnsolvable(){
        int[][] testArray = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 15, 14, 0}};
        assertFalse(editor.isSolvable(testArray));
    }

}
