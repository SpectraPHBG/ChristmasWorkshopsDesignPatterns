package christmasworkshop.factories;

import christmasworkshop.ToyTypes;
import christmasworkshop.toys.Bike;
import christmasworkshop.toys.Doll;
import christmasworkshop.toys.Toy;

public class ChristmasWorkshopFactory extends ToyFactory{

    @Override
    public Toy create(ToyTypes toyType) {
        if(toyType.equals(ToyTypes.DOLL)){
            return new Doll();
        }
        else if(toyType.equals(ToyTypes.BIKE)){
            return new Bike();
        }

        return null;
    }

}
