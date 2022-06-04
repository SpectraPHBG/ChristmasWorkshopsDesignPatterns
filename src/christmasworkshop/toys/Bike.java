package christmasworkshop.toys;

import christmasworkshop.toys.Toy;

public class Bike extends Toy {

    public Bike() {
        this.setWeight(97);
    }

    @Override
    public void makeSound() {
        System.out.println("Звънецът на колелото звънти!");
    }
}
