package controller.regex;

import controller.Controller;
import model.Model;
import org.junit.BeforeClass;
import view.View;

import static org.mockito.Mockito.mock;

/**
 * Created by andrew_yashin on 4/20/17.
 */
public abstract class RegExTest {
    private static Controller controller;

    @BeforeClass
    public static void initController(){
        Model model = mock(Model.class);
        View view = mock(View.class);

        controller = new Controller(view, model);
        System.out.println("Controller created");
    }

    public boolean check(String input, String pattern){
        return controller.checkField(input, pattern);
    }
}
