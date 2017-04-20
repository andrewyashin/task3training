package controller.regex;

import static org.junit.Assert.*;

import model.Examples;
import model.RegExpUser;
import org.junit.Test;

/**
 * Created by andrew_yashin on 4/20/17.
 */
public class CommentTest extends RegExTest {
    @Test
    public void checkCommentWithExample(){
        assertTrue(check(Examples.COMMENT, RegExpUser.COMMENT_REG));
    }

    @Test
    public void checkEmptyComment(){
        assertTrue(check("", RegExpUser.COMMENT_REG));
    }
}
