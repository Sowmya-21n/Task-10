package task10;

public class Account {
    private double balance;

    // Constructor with no arguments
    public Account() {
        this.balance = 0;
    }

    // Constructor with two arguments
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit balance
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited " + amount + " units. Current balance: " + this.balance);
    }

    // Method to withdraw balance
    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrawn " + amount + " units. Current balance: " + this.balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public static void main(String[] args) {
        // Create an account object with default balance
        Account account1 = new Account();
        account1.deposit(100);  // Deposit 100 units
        account1.withdraw(50);  // Withdraw 50 units
        account1.withdraw(70);  // Attempt to withdraw 70 units (insufficient balance)

        // Create an account object with initial balance
        Account account2 = new Account(500);
        account2.deposit(200);  // Deposit 200 units
        account2.withdraw(700);  // Attempt to withdraw 700 units (insufficient balance)
    }
}
