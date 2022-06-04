package christmasworkshop.commands;

import christmasworkshop.ToyTypes;
import christmasworkshop.observers.MagicBoard;

public class NeedDollCommand implements Command{

    private MagicBoard magicBoard;

    public NeedDollCommand(MagicBoard magicBoard) {
        this.magicBoard = magicBoard;
    }

    @Override
    public void execute() {
        System.out.println("На магическата дъска се изписва думата \"Кукла\"");
        magicBoard.setNeededToy(ToyTypes.DOLL);
    }
}
