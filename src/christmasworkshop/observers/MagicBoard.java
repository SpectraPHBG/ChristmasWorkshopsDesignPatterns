package christmasworkshop.observers;

import christmasworkshop.ToyTypes;

import java.util.ArrayList;
import java.util.List;

public class MagicBoard implements Observable {

    List<Observer> elves;
    ToyTypes neededToy;

    public MagicBoard() {
        elves = new ArrayList<>();
    }

    @Override
    public void attach(Observer elf) {
        elves.add(elf);
    }

    @Override
    public void detach(Observer elf) {
        elves.remove(elf);
    }

    @Override
    public void notifyObservers() {
        for (Observer elf:
             elves) {
            elf.update();
        }
    }

    public ToyTypes getUpdate() {
        return neededToy;
    }

    public void setNeededToy(ToyTypes neededToy) {
        this.neededToy = neededToy;
        notifyObservers();
    }
}
