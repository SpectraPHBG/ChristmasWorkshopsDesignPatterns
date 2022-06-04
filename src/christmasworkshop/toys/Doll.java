package christmasworkshop.toys;

import christmasworkshop.toys.Toy;

public class Doll extends Toy {

    public Doll() {
        this.setWeight(5);
    }

    @Override
    public void makeSound() {
        System.out.println("Куклата казва Ла Ла Ла!");
    }
}
