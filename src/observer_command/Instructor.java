package observer_command;

import observer_command.interfaces.Command;

public class Instructor {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        System.out.println("Instructor is switching the exercise.");
        this.command.execute();
    }

}
