package controller.regex;

import model.RegExpUser;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by andrew_yashin on 4/20/17.
 */
public class MobilePhone2Test extends RegExTest {
    @Test
    public void checkSecondPhoneNumberForEmpty(){
        assertTrue(check("", RegExpUser.MOBILEPHONE_REG2));
    }

    @Test
    public void checkMobilePhoneNumberWithoutSpaces(){
        assertTrue(check("0663533848", RegExpUser.MOBILEPHONE_REG));
    }
}
