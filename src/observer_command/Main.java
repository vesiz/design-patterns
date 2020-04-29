package observer_command;

import observer_command.commands.LayDownCommand;
import observer_command.commands.StandUpCommand;
import observer_command.interfaces.Command;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Instructor instructor = new Instructor();
        Trainee trainee = new Trainee();

        List<Command> exercises = new ArrayList<Command>();
        List<Viewer> viewers = new ArrayList<Viewer>();

        exercises.add(new LayDownCommand(trainee));
        exercises.add(new StandUpCommand(trainee));

        viewers.add(new Viewer("Viewer 1"));
        viewers.add(new Viewer("Viewer 2"));
        viewers.add(new Viewer("Viewer 3"));

        for (Viewer viewer : viewers) {
            trainee.subscribe(viewer);
        }

        while (true) {
            for (Command command : exercises) {
                instructor.setCommand(command);
                instructor.executeCommand();
                System.out.println();

                Thread.sleep(3000);
            }
        }
    }
}
