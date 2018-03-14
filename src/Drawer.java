import Exceptions.NoProperValueException;
import Validators.DirectionValidator;
import Validators.HeightValidator;

public class Drawer {

    private Tree tree;

    private char leaf = 'X';
    private int height = 10;
    private String direction = "up";

    public void getConfigFromUser(){
        HeightValidator hVal = new HeightValidator(0,20);
        DirectionValidator dVal = new DirectionValidator();

        try {
            System.out.print("Podaj wyskosc: ");
            this.height = hVal.getValue();
            System.out.print("Podaj kierunek [up/down/left/right]: ");
            this.direction = dVal.getValue();
        }
        catch(NoProperValueException e)
        {
            System.out.println("Niedozwolona wartosc! Uzywam parametrow domyslnych");
        }
    }

    public void draw(){
        switch(direction) {
            case "up":
                tree = new upTree(height, leaf);
                break;
            case "down":
                tree = new downTree(height, leaf);
                break;
            case "left":
                tree = new leftTree(height, leaf);
                break;
            case "right":
                tree = new rightTree(height, leaf);
                break;
        }
        tree.draw();

    }
}
