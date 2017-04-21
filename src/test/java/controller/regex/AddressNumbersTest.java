package controller.regex;

import model.Examples;
import model.RegExpUser;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressNumbersTest extends RegExTest {

    @Test
    public void checkFlatNumberWithExample(){
        assertTrue(check(Examples.FLAT_NUMBER, RegExpUser.FLAT_NUMBER_REG));
    }

    @Test
    public void checkNumberHomeWithExample(){
        assertTrue(check(Examples.NUMBERHOME, RegExpUser.NUMBERHOME_REG));
    }
}
