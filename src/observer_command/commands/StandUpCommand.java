package observer_command.commands;

import observer_command.Trainee;
import observer_command.interfaces.Command;

public class StandUpCommand implements Command {

    private Trainee trainee;

    public StandUpCommand(Trainee trainee) {
        this.trainee = trainee;
    }

    @Override
    public void execute() {
        this.trainee.setCurrentExercise("Standing up");
    }
}
