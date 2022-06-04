package christmasworkshop;

import christmasworkshop.commands.Command;

import java.util.Random;

public class SantaClaus {

    private static SantaClaus instance;
    private Command needToyCommand;

    private SantaClaus() {

    }

    public static SantaClaus getInstance(){

        synchronized (SantaClaus.class){
            if(instance == null){
                instance = new SantaClaus();
            }
        }

        return instance;
    }

    public void setCommand(Command needToyCommand){
        this.needToyCommand = needToyCommand;
    }

    public void writeOnMagicBoard(String toyNeeded){
        if(this.needToyCommand == null) {
            System.out.println("Дядо коледа няма нужда от играчки в момента!");
            return;
        }

        System.out.printf("Дядо Коледа изрича магическата дума: \"%s\"%n",toyNeeded);
        needToyCommand.execute();
    }

    public String needToy(){
        Random rand = new Random();
        String[] needs={"Трябват ми кукли","Трябват ми колелета"};
        return needs[rand.nextInt(2)];
    }
}
