package controller.regex;

import model.Examples;
import model.RegExpUser;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmailTest extends RegExTest {

    @Test
    public void checkEmailWithDog(){
        assertFalse(check("and97ukr.net", RegExpUser.EMAIL_REG));
    }

    @Test
    public void checkEmailWithoutDot(){
        assertFalse(check("andy97@ukrnet", RegExpUser.EMAIL_REG));
    }

    @Test
    public void checkEmailWithExample(){
        assertTrue(check(Examples.EMAIL, RegExpUser.EMAIL_REG));
    }

    @Test
    public void checkEmailWithoutDogAndDot(){
        assertFalse(check("andy97ukrnet", RegExpUser.EMAIL_REG));
    }

    @Test
    public void checkEmailStartsWithNumbers(){
        assertFalse(check("123andy97@ukr.net", RegExpUser.EMAIL_REG));
    }

    @Test
    public void checkEmailWithSymbols(){
        assertFalse(check("!@#$%", RegExpUser.EMAIL_REG));
    }
}
