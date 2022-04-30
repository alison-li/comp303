/**
 * Observer Pattern Demo
 */
public class Test {
    public static void main(String[] args) {
        CreditCard HSBCCreditCard = new CreditCard(); // Subject
        BankAccount HSBCAccount = new BankAccount(HSBCCreditCard); // Observer

        HSBCCreditCard.register(HSBCAccount); // Register the Observer
        HSBCCreditCard.charge(1000.70); // Perform the operation of interest to the Observer

        HSBCAccount.payBill(); // Clear the balance in the credit card
    }
}