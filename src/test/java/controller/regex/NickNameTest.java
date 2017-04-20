package controller.regex;

import model.Examples;
import model.RegExUser;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by andrew_yashin on 4/20/17.
 */
public class NickNameTest extends RegExTest {
    @Test
    public void checkNickNameWithExample(){
        assertTrue(check(Examples.NICKNAME, RegExUser.NICKNAME_REG));
    }

    @Test
    public void checkNickNameWithNumberAtStart(){
        assertFalse(check("1sadad", RegExUser.NICKNAME_REG));
    }

    @Test
    public void checkRightNickName(){
        assertTrue(check("razor999", RegExUser.NICKNAME_REG));
    }

    @Test
    public void checkNickNameWithDifferentSymbols(){
        assertFalse(check("raz!@#99", RegExUser.NICKNAME_REG));
    }

    @Test
    public void checkNickNameWithDot(){
        assertTrue(check("andrew.yashin", RegExUser.NICKNAME_REG));
    }

}
