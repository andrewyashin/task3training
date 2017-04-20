package controller.regex;

import static org.junit.Assert.*;

import model.Examples;
import model.RegExUser;
import org.junit.Test;

/**
 * Created by andrew_yashin on 4/20/17.
 */
public class MobilePhoneTest extends RegExTest {
    @Test
    public void checkMobilePhoneNumberWithExample(){
        assertTrue(check(Examples.MOBILEPHONE, RegExUser.MOBILEPHONE_REG));
    }

    @Test
    public void checkMobilePhoneNumberWithoutSpaces(){
        assertTrue(check("0663533848", RegExUser.MOBILEPHONE_REG));
    }

    @Test
    public void checkMobilePhoneNumberWithSpaces(){
        assertTrue(check("066 353 3848", RegExUser.MOBILEPHONE_REG));
    }

    @Test
    public void checkMobilePhoneNumberWithBrackets(){
        assertTrue(check("(345) 456 7789", RegExUser.MOBILEPHONE_REG));
    }

    @Test
    public void checkMobilePhoneNumberWithDifferentSymbols(){
        assertFalse(check("!@#$%^^&*()", RegExUser.MOBILEPHONE_REG));
    }

    @Test
    public void checkMobilePhoneNumberWithCharacters(){
        assertFalse(check("asdad", RegExUser.MOBILEPHONE_REG));
    }

    @Test
    public void checkMobilePhoneNumberWithTires(){
        assertTrue(check("(066)-456-1234", RegExUser.MOBILEPHONE_REG));
    }
}
