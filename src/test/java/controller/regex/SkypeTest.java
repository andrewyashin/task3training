package controller.regex;

import model.Examples;
import model.RegExpUser;
import org.junit.Test;
import static org.junit.Assert.*;

public class SkypeTest extends RegExTest {
    @Test
    public void checkSkypeWithExample(){
        assertTrue(check(Examples.SKYPE, RegExpUser.SKYPE_REG));
    }

    @Test
    public void checkSkypeForDifferentSymbols(){
        assertFalse(check("!@#$", RegExpUser.SKYPE_REG));
    }

    @Test
    public void checkSkypeStartsWithNumber(){
        assertFalse(check("12312sadsa", RegExpUser.SKYPE_REG));
    }
}
