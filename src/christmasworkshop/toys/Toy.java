package christmasworkshop.toys;

public abstract class Toy {

    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public abstract void makeSound();
}
