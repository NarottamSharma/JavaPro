package three.abstraction;

public class SavingAccount extends BankAccount {
    @Override
    public void deposit(double amount) {
        IO.println("Deposited "+ amount);
    }

    @Override
    public void withdraw(double amount) {
        IO.println("Withdrawn "+ amount);
    }
}
