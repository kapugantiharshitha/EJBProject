import javax.ejb.Stateful;

@Stateful
public class BankBean {
    private double balance = 0.0;
	private double amount;

    public double getBalance() {
        return balance;
    }

    public void deposit() {
        // Code to deposit amount from UI input
        // Let's assume the deposit amount is stored in a variable called 'amount'
        balance += amount;
    }

    public void withdraw() {
        // Code to withdraw amount from UI input
        // Let's assume the withdraw amount is stored in a variable called 'amount'
        if (amount <= balance) {
            balance -= amount;
        } else {
            // Handle insufficient funds
            // For simplicity, let's just set the balance to zero
            balance = 0.0;
        }
    }
}
