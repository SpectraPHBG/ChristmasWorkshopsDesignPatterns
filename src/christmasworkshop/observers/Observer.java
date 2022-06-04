package christmasworkshop.observers;

public interface Observer {

    void setTopic(Observable subject);
    void update();
}
