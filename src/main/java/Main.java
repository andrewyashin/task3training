import controller.Controller;
import model.Model;
import view.View;

/**
 * Created by andrew_yashin on 4/20/17.
 */
public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();

        Controller controller = new Controller(view, model);
        controller.processUser();

    }
}
