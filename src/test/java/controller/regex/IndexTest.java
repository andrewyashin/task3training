package controller.regex;

import model.Examples;
import model.RegExpUser;
import org.junit.Test;

import static org.junit.Assert.*;

public class IndexTest extends RegExTest {
    @Test
    public void checkIndexWithExample(){
        assertTrue(check(Examples.INDEX, RegExpUser.INDEX_REG));
    }

    @Test
    public void checkIndexWithTwoNumbers(){
        assertFalse(check("23", RegExpUser.INDEX_REG));
    }

    @Test
    public void checkIndexWithSixNumbers(){
        assertFalse(check("312231", RegExpUser.INDEX_REG));
    }

    @Test
    public void checkIndexWithCharacters(){
        assertFalse(check("sadasd", RegExpUser.INDEX_REG));
    }
}
