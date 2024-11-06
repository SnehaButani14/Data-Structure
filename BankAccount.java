import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0; // Initial balance is zero
    }
        
    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid amount. Deposit amount must be greater than zero.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Account Balance: " + balance);
    }

    // Main method to demonstrate usage
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array of BankAccount objects
        BankAccount[] accounts = new BankAccount[3]; // Array of 3 BankAccount objects

        // Initialize some bank accounts
        accounts[0] = new BankAccount("ACC001", "John Doe");
        accounts[1] = new BankAccount("ACC002", "Jane Smith");
        accounts[2] = new BankAccount("ACC003", "Michael Johnson");

        // Demonstrate operations on the accounts
        System.out.println("Welcome to the Bank!");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            int accountIndex;

            switch (choice) {
                case 1:
                    System.out.print("Enter account number to deposit into (0-2): ");
                    accountIndex = scanner.nextInt();
                    if (accountIndex >= 0 && accountIndex < accounts.length) {
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        accounts[accountIndex].deposit(depositAmount);
                    } else {
                        System.out.println("Invalid account number.");
                    }
                    break;
                case 2:
                    System.out.print("Enter account number to withdraw from (0-2): ");
                    accountIndex = scanner.nextInt();
                    if (accountIndex >= 0 && accountIndex < accounts.length) {
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        accounts[accountIndex].withdraw(withdrawAmount);
                    } else {
                        System.out.println("Invalid account number.");
                    }
                    break;
                case 3:
                    System.out.print("Enter account number to check balance (0-2): ");
                    accountIndex = scanner.nextInt();
                    if (accountIndex >= 0 && accountIndex < accounts.length) {
                        accounts[accountIndex].checkBalance();
                    } else {
                        System.out.println("Invalid account number.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the Bank. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }
}
