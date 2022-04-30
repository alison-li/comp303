import java.util.List;
import java.util.ArrayList;

/**
 * Invoker
 */

public class VirtualAssistant {
    Command slot;
    List<Command> log = new ArrayList<>(); // a record of all commands

    public void issueCommand(Command pCommand) {
        slot = pCommand;
        log.add(slot);
        slot.execute();
    }

    public void undoCommand() {
        slot.undo();
    }

    public void displayCommandLog() {
        System.out.println("Command history:");
        System.out.println();
        for (Command command : log) {
            command.execute();
        }
    }
}