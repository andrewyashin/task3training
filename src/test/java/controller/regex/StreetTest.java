package controller.regex;

import model.Examples;
import model.RegExpUser;
import org.junit.Test;

import static org.junit.Assert.*;

public class StreetTest extends RegExTest {
    @Test
    public void checkStreetNameWithExample(){
        assertTrue(check(Examples.STREET, RegExpUser.STREET_REG));
    }

    @Test
    public void checkStreetNameStartsWithSmallLetter(){
        assertFalse(check("affasf", RegExpUser.STREET_REG));
    }

    @Test
    public void checkStreetNameWithNumbers(){
        assertFalse(check("Kiev123", RegExpUser.STREET_REG));
    }
}
