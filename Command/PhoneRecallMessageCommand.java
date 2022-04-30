public class PhoneRecallMessageCommand implements Command {
    Phone aPhone;

    public PhoneRecallMessageCommand(Phone pPhone) {
        aPhone = pPhone;
    }

    @Override
    public void execute() {
        aPhone.recallMessage();
    }

    @Override
    public void undo() {
        aPhone.message();
    }
}