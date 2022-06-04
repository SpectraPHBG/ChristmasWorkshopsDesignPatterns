package christmasworkshop.observers;

import christmasworkshop.ToyTypes;

public interface Observable {
    void attach(Observer observer);
    void detach(Observer observer);

    void notifyObservers();
    ToyTypes getUpdate();
}
