class Account {
    private String accountNumber;
    private double balance;
    public Account(String accountNumber, double balance) {
        if (accountNumber == null || accountNumber.isEmpty()) {
            System.out.println("Error: Account number cannot be null or empty.");
        }
        else if (balance < 0) {
            System.out.println("Error: Balance cannot be negative.");
        }
        else {
            this.accountNumber = accountNumber;
            this.balance = balance;
            System.out.println("Account created successfully!");
        }
    }
    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
        Account acc1 = new Account("A12345", 5000);
        acc1.displayAccount();
        Account acc2 = new Account("", 3000);
        Account acc3 = new Account("B67890", -1000);
    }
}

