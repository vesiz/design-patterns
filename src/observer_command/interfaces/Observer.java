package observer_command.interfaces;

public interface Observer {
    public void update();

    public void setTopic(Observable topic);
}
