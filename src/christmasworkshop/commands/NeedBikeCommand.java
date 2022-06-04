package christmasworkshop.commands;

import christmasworkshop.ToyTypes;
import christmasworkshop.observers.MagicBoard;

public class NeedBikeCommand implements Command{

    private MagicBoard magicBoard;

    public NeedBikeCommand(MagicBoard magicBoard) {
        this.magicBoard = magicBoard;
    }

    @Override
    public void execute() {
        System.out.println("На магическата дъска се изписва думата \"Колело\"");
        this.magicBoard.setNeededToy(ToyTypes.BIKE);
    }
}
