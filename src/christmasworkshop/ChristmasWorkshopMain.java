package christmasworkshop;

import christmasworkshop.commands.Command;
import christmasworkshop.commands.NeedBikeCommand;
import christmasworkshop.commands.NeedDollCommand;
import christmasworkshop.observers.ElfWorker;
import christmasworkshop.observers.MagicBoard;
import christmasworkshop.observers.Observer;

public class ChristmasWorkshopMain {
    public static void main(String[] args) {
        MagicBoard magicBoard = new MagicBoard();
        Observer elf1= new ElfWorker("elf1");
        Observer elf2= new ElfWorker("elf2");
        Observer elf3= new ElfWorker("elf3");

        magicBoard.attach(elf1);
        magicBoard.attach(elf2);
        magicBoard.attach(elf3);

        elf1.setTopic(magicBoard);
        elf2.setTopic(magicBoard);
        elf3.setTopic(magicBoard);

        Command needDollCommand = new NeedDollCommand(magicBoard);
        Command needBikeCommand = new NeedBikeCommand(magicBoard);

        SantaClaus santaClaus = SantaClaus.getInstance();

        String toyNeeded;

        for (int i = 0; i < 8; i++) {

            toyNeeded = santaClaus.needToy();

            if(toyNeeded.equals("Трябват ми кукли")){
                santaClaus.setCommand(needDollCommand);
            }
            else {
                santaClaus.setCommand(needBikeCommand);
            }

            santaClaus.writeOnMagicBoard(toyNeeded);
            System.out.println();
        }
    }
}
