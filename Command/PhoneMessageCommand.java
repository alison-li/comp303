public class PhoneMessageCommand implements Command {
    Phone aPhone;
        
    public PhoneMessageCommand(Phone pPhone) {
        aPhone = pPhone;
    }

    @Override
    public void execute() {
        aPhone.message();
    }

    @Override
    public void undo() {
        aPhone.recallMessage();
    }
}