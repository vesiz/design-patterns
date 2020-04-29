package observer_command.commands;

import observer_command.Trainee;
import observer_command.interfaces.Command;

public class LayDownCommand implements Command {

    private Trainee trainee;

    public LayDownCommand(Trainee trainee) {
        this.trainee = trainee;
    }

    @Override
    public void execute() {
        this.trainee.setCurrentExercise("Laying down");
    }
}
