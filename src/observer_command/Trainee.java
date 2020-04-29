package observer_command;

import observer_command.interfaces.Observable;
import observer_command.interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

public class Trainee implements Observable {

    private String currentExercise;
    public List<Observer> observers = new ArrayList<Observer>();

    public void setCurrentExercise(String exercise) {
        this.currentExercise = exercise;
        System.out.println("Trainee is changing the exercise to: " + this.currentExercise);
        this.notifyObservers();
    }

    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
        observer.setTopic(this);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update();
        }
    }

    @Override
    public String getUpdate() {
        return this.currentExercise;
    }
}
