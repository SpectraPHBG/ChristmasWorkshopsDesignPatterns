package christmasworkshop.observers;

import christmasworkshop.ToyTypes;
import christmasworkshop.factories.ChristmasWorkshopFactory;
import christmasworkshop.factories.ToyFactory;
import christmasworkshop.toys.Toy;

public class ElfWorker implements Observer{

    private String name;
    private Observable magicBoard;
    private ToyFactory christmasToyFactory;

    public ElfWorker(String name) {
        this.name = name;
        this.christmasToyFactory = new ChristmasWorkshopFactory();
    }

    @Override
    public void setTopic(Observable magicBoard) {
        this.magicBoard=magicBoard;
    }

    private void takeToyFromWorkshop(ToyTypes toyType){

        Toy neededToy;

        System.out.printf("%s отива да вземе играчката от работилницата",name);
        neededToy=christmasToyFactory.create(toyType);
        if(neededToy != null){
            testToy(neededToy);
        }
        else{
            System.out.printf(", но работилницата на Дядо Коледа не произвежда такива играчки!%n");
        }
    }

    private void testToy(Toy neededToy){
        System.out.printf(" и я тества!%n");
        neededToy.makeSound();
    }

    @Override
    public void update() {
        ToyTypes neededToy=magicBoard.getUpdate();
        takeToyFromWorkshop(neededToy);
    }
}
