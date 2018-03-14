import Exceptions.NoProperValueException;
import Validators.DirectionValidator;
import Validators.HeightValidator;


public class MainApp {
    public static void main(String[] args) {

        Drawer drawer = new Drawer();
        drawer.getConfigFromUser();
        drawer.draw();
    }
}
