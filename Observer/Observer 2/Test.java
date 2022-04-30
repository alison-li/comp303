/**
 * Observer Pattern Demo
 * This second example illustrates the pull model whereby the observer is sent minimal notifications and asks for explicit details after.
 * The UndergradStudent upon receiving an interview offer must check their interview time.
 */
public class Test {
    public static void main(String[] args) {
        Company amazon = new Company(); // subject
        UndergradStudent jongpoop = new UndergradStudent(); // observer
        
        jongpoop.applyToCompany(amazon);
        amazon.acceptApplication(jongpoop);
        amazon.sendOffer(jongpoop);
    }
}