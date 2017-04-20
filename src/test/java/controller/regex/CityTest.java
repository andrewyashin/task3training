package controller.regex;

import model.Examples;
import model.RegExpUser;
import org.junit.Test;
import static org.junit.Assert.*;

public class CityTest extends RegExTest {

    @Test
    public void checkCityWithExample(){
        assertTrue(check(Examples.CITY, RegExpUser.CITY_REG));
    }

    @Test
    public void checkCityStartsWithSmallLetter(){
        assertFalse(check("kiev", RegExpUser.CITY_REG));
    }

    @Test
    public void checkCityWithNumbers(){
        assertFalse(check("kiev234", RegExpUser.CITY_REG));
    }

    @Test
    public void checkCityWithDifferentSymbols(){
        assertFalse(check("kiev!@#", RegExpUser.CITY_REG));
    }

    @Test
    public void checkCityWithEmptyString(){
        assertFalse(check("", RegExpUser.CITY_REG));
    }
}
