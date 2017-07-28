package com.command;

import com.Action;
import com.CustomInputStream;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by yulia on 28.07.17.
 */
public class CommandManagerTest {

    private CustomInputStream in;
    private CommandManager manager;

    @Before
    public void setup() {
        in = new CustomInputStream();
        manager = new CommandManager();
        System.setIn(in);
    }



    @Test
    public void shouldReadCommandUP(){
        in.add("w");
        Assert.assertEquals(manager.getAction(), Action.UP);
    }
    @Test
    public void shouldReadCommandDOWN(){
        in.add("s");
        assertEquals(manager.getAction(), Action.DOWN);
    }
    @Test
    public void shouldReadCommandLEFT(){
        in.add("a");
        assertEquals(manager.getAction(), Action.LEFT);
    }
    @Test
    public void shouldReadCommandRIGHT(){
        in.add("d");
        assertEquals(manager.getAction(), Action.RIGHT);
    }
    @Test
    public void shouldReturnNull(){
        in.add("k");
        assertNull(manager.getAction());
    }


}
