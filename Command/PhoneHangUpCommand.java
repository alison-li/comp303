public class PhoneHangUpCommand implements Command {
    Phone aPhone;

    public PhoneHangUpCommand(Phone pPhone) {
        aPhone = pPhone;
    }

    @Override
    public void execute() {
        aPhone.hangUp();
    }

    @Override
    public void undo() {
        aPhone.call();
    }
}