package controller.regex;

import model.Examples;
import model.RegExUser;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andrew_yashin on 4/20/17.
 */
public class FIOTest extends RegExTest {

    @Test
    public void checkNameWithExample(){
        assertTrue(check(Examples.NAME, RegExUser.NAME_REG));
    }
    @Test
    public void checkRightName(){
        assertTrue(check("Sasha", RegExUser.NAME_REG));
    }

    @Test
    public void checkNameStartsFromSmallLetter(){
        assertFalse(check("sasha", RegExUser.NAME_REG));
    }

    @Test
    public void checkNameWithDigits(){
        assertFalse(check("Andrew1", RegExUser.NAME_REG));
    }

    @Test
    public void checkNameWithOnlyDigits(){
        assertFalse(check("123123", RegExUser.NAME_REG));
    }

    @Test
    public void checkNameWithDifferentSymbols(){
        assertFalse(check("!@#$%^&*(", RegExUser.NAME_REG));
    }

    @Test
    public void checkEmptyName(){
        assertFalse(check("", RegExUser.NAME_REG));
    }

    @Test
    public void checkNameWithOnlyOneSymbol(){
        assertFalse(check("A", RegExUser.NAME_REG));
    }
}