/**
 * Concrete Observer
 */
public class BankAccount implements Observer {
    private CreditCard card;
    private double balance;

    public BankAccount(CreditCard card) {
        this.card = card;
    }

    public void update(double balance) {
        this.balance = balance;
        System.out.println("Your credit card statement balance: " + balance);
    }

    public void payBill() {
        System.out.println("Thank you for your payment!");
        card.clearBalance();
    }
}