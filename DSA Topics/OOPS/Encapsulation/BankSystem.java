//Time Complexity: O(1)

class SecureBankAccount {
    private String accountHolder;
    private double balance;

   
    public SecureBankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        }
    }

    
    public String getAccountHolder() {
        return accountHolder;
    }

  
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

   
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
     public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited:" + amount);
        }
    }

    // Method to withdraw money 
     public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn:" + amount);
        }
    }

    // Method to display account details
     public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance:" + balance);
        System.out.println();
    }
}


public class BankSystem {
    public static void main(String[] args) {
      
        SecureBankAccount acc1 = new SecureBankAccount("Farru", 1000);
        acc1.displayAccountInfo();

        
        acc1.deposit(500);
        acc1.withdraw(200);
        acc1.displayAccountInfo();

        // Invalid operations
        acc1.withdraw(2000);  
        acc1.deposit(-50);  
    }
}
