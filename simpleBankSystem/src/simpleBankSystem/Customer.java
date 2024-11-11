package simpleBankSystem;

public class Customer {

	private String name;
    private BankAccount account;

    public Customer(String name, String accountNumber, double initialBalance) {
        this.name = name;
        this.account = new BankAccount(accountNumber, initialBalance);
    }

    public void showBalance() {
        System.out.println(name + "'s Account Balance: " + account.getBalance());
    }

    public void depositToAccount(double amount) {
        account.deposit(amount);
    }

    public void withdrawFromAccount(double amount) {
        account.withdraw(amount);
    }

    public String getAccountNumber() {
        return account.getAccountNumber();
    }

    public String getName() {
        return name;
    }
}
