package controller.regex;

import static org.junit.Assert.*;

import model.Examples;
import model.RegExpUser;
import org.junit.Test;

/**
 * Created by andrew_yashin on 4/20/17.
 */
public class MobilePhoneTest extends RegExTest {
    @Test
    public void checkMobilePhoneNumberWithExample(){
        assertTrue(check(Examples.MOBILEPHONE, RegExpUser.MOBILEPHONE_REG));
    }

    @Test
    public void checkMobilePhoneNumberWithoutSpaces(){
        assertTrue(check("0663533848", RegExpUser.MOBILEPHONE_REG));
    }

    @Test
    public void checkMobilePhoneNumberWithSpaces(){
        assertTrue(check("066 353 3848", RegExpUser.MOBILEPHONE_REG));
    }

    @Test
    public void checkMobilePhoneNumberWithBrackets(){
        assertTrue(check("(345) 456 7789", RegExpUser.MOBILEPHONE_REG));
    }

    @Test
    public void checkMobilePhoneNumberWithDifferentSymbols(){
        assertFalse(check("!@#$%^^&*()", RegExpUser.MOBILEPHONE_REG));
    }

    @Test
    public void checkMobilePhoneNumberWithCharacters(){
        assertFalse(check("asdad", RegExpUser.MOBILEPHONE_REG));
    }

    @Test
    public void checkMobilePhoneNumberWithTires(){
        assertTrue(check("(066)-456-1234", RegExpUser.MOBILEPHONE_REG));
    }
}
