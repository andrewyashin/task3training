package controller.regex;

import model.RegExUser;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by andrew_yashin on 4/20/17.
 */
public class MobilePhone2Test extends RegExTest {
    @Test
    public void checkSecondPhoneNumberForEmpty(){
        assertTrue(check("", RegExUser.MOBILEPHONE_REG2));
    }

    @Test
    public void checkMobilePhoneNumberWithoutSpaces(){
        assertTrue(check("0663533848", RegExUser.MOBILEPHONE_REG));
    }
}
