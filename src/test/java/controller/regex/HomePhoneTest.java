package controller.regex;

import static org.junit.Assert.*;

import model.Examples;
import model.RegExpUser;
import org.junit.Test;

/**
 * Created by andrew_yashin on 4/20/17.
 */
public class HomePhoneTest extends RegExTest {
    @Test
    public void checkHomePhoneNumberWithExample(){
        assertTrue(check(Examples.HOMEPHONE, RegExpUser.HOMEPHONE_REG));
    }

    @Test
    public void checkHomePhoneNumberWithDifferentSymbols(){
        assertFalse(check("!@#$", RegExpUser.HOMEPHONE_REG));
    }

    @Test
    public void checkHomePhoneNumberWithCharacters(){
        assertFalse(check("asdasd", RegExpUser.HOMEPHONE_REG));
    }

    @Test
    public void checkHomePhoneNumberWithoutSpaces(){
        assertFalse(check("2344545", RegExpUser.HOMEPHONE_REG));
    }

    @Test
    public void checkHomePhoneNumberForFiveNumbers(){
        assertFalse(check("123 34", RegExpUser.HOMEPHONE_REG));
    }

    @Test
    public void checkHomePhoneNumberForTenNumbers(){
        assertFalse(check("213 23 23 2", RegExpUser.HOMEPHONE_REG));
    }
}
