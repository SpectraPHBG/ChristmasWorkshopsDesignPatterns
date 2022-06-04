package christmasworkshop.factories;

import christmasworkshop.ToyTypes;
import christmasworkshop.toys.Toy;

public abstract class ToyFactory {

    public abstract Toy create(ToyTypes toyType);
}
