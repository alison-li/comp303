/**
 * Receiver
 */
public class Light {
    private boolean isOn;
    
    public void on() {
        isOn = true;
        System.out.println("The light is ON");
    }

    public void off() {
        isOn = false;
        System.out.println("The light is OFF");
    }
}