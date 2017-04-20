package controller.regex;

import model.Examples;
import model.RegExpUser;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andrew_yashin on 4/20/17.
 */
public class FIOTest extends RegExTest {

    @Test
    public void checkNameWithExample(){
        assertTrue(check(Examples.NAME, RegExpUser.NAME_REG));
    }
    @Test
    public void checkRightName(){
        assertTrue(check("Sasha", RegExpUser.NAME_REG));
    }

    @Test
    public void checkNameStartsFromSmallLetter(){
        assertFalse(check("sasha", RegExpUser.NAME_REG));
    }

    @Test
    public void checkNameWithDigits(){
        assertFalse(check("Andrew1", RegExpUser.NAME_REG));
    }

    @Test
    public void checkNameWithOnlyDigits(){
        assertFalse(check("123123", RegExpUser.NAME_REG));
    }

    @Test
    public void checkNameWithDifferentSymbols(){
        assertFalse(check("!@#$%^&*(", RegExpUser.NAME_REG));
    }

    @Test
    public void checkEmptyName(){
        assertFalse(check("", RegExpUser.NAME_REG));
    }

    @Test
    public void checkNameWithOnlyOneSymbol(){
        assertFalse(check("A", RegExpUser.NAME_REG));
    }
}