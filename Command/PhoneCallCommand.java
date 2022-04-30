public class PhoneCallCommand implements Command {
    Phone aPhone;

    public PhoneCallCommand(Phone pPhone) {
        aPhone = pPhone;
    }

    @Override
    public void execute() {
        aPhone.call();
    }

    @Override
    public void undo() {
        aPhone.hangUp();
    }
}