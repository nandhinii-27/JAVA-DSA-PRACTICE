class BankAccount {
    double balance;
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Balance: " + balance);
    }
    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
        System.out.println("Balance: " + balance);
    }
}
class SavingsAccount extends BankAccount {
    void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Minimum balance of 100 required");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Balance: " + balance);
        }
    }
}
public class Account{
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount();
        acc.balance = 500;
        acc.deposit(200);
        acc.withdraw(550);
        acc.withdraw(300);
    }
}
