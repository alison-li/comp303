/**
 * Command Pattern Demo
 */
public class VirtualAssistantTest {
    public static void main(String[] args) {
        VirtualAssistant siri = new VirtualAssistant();
        Light light = new Light();
        siri.issueCommand(new LightOnCommand(light));
        siri.issueCommand(new LightOffCommand(light));

        Phone phone = new Phone();
        siri.issueCommand(new PhoneCallCommand(phone));
        siri.undoCommand();

        // siri.displayCommandLog();
    }
}