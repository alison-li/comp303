/**
 * Concrete Command
 */
public class LightOnCommand implements Command {
    Light aLight;

    public LightOnCommand(Light pLight) {
        aLight = pLight; 
    }

    @Override
    public void execute() {
        aLight.on();
    }

    @Override
    public void undo() {
        aLight.off();
    }
}