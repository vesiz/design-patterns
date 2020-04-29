package observer_command;

import observer_command.interfaces.Observable;
import observer_command.interfaces.Observer;

public class Viewer implements Observer {

    private String name;
    private Observable trainee;

    public Viewer(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        if (trainee == null) {
            System.out.println("This viewer has their stream turned off");
            return;
        }

        String currentExercise = trainee.getUpdate();
        System.out.println(this.getName() + " is changing the exercise to: " + currentExercise);
    }

    @Override
    public void setTopic(Observable topic) {
        this.trainee = topic;
    }
}
