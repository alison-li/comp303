/**
 * A second Receiver to illustrate the ability to undo operations with Command Pattern
 */
public class Phone {    
    
    public void call() {
        System.out.println("Calling...");
    }

    public void hangUp() {
        System.out.println("Ending call...");
    }

    public void message() {
        System.out.println("Sending message...");
    }

    public void recallMessage() {
        System.out.println("Recalling message...");
    }
}