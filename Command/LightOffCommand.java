/**
 * Concrete Command
 */
public class LightOffCommand implements Command {
    Light aLight;

    public LightOffCommand(Light pLight) {
        aLight = pLight; 
    }

    @Override
    public void execute() {
        aLight.off();
    }

    @Override
    public void undo() {
        aLight.off();
    }
}