package controller.regex;

import static org.junit.Assert.*;

import model.Examples;
import model.RegExUser;
import org.junit.Test;

/**
 * Created by andrew_yashin on 4/20/17.
 */
public class HomePhoneTest extends RegExTest {
    @Test
    public void checkHomePhoneNumberWithExample(){
        assertTrue(check(Examples.HOMEPHONE, RegExUser.HOMEPHONE_REG));
    }

    @Test
    public void checkHomePhoneNumberWithDifferentSymbols(){
        assertFalse(check("!@#$", RegExUser.HOMEPHONE_REG));
    }

    @Test
    public void checkHomePhoneNumberWithCharacters(){
        assertFalse(check("asdasd", RegExUser.HOMEPHONE_REG));
    }

    @Test
    public void checkHomePhoneNumberWithoutSpaces(){
        assertFalse(check("2344545", RegExUser.HOMEPHONE_REG));
    }

    @Test
    public void checkHomePhoneNumberForFiveNumbers(){
        assertFalse(check("123 34", RegExUser.HOMEPHONE_REG));
    }

    @Test
    public void checkHomePhoneNumberForTenNumbers(){
        assertFalse(check("213 23 23 2", RegExUser.HOMEPHONE_REG));
    }
}
