public class LexAccount {
    private String name;
    private double balance;

    // Constructor to initialize the account with a name and default balance
    public LexAccount(String name){
        this.name = name;
        this.balance = 2; // Default balance is set to 2
    }

    // Getter method for name
    public String getName(){
        return name;
    }

    // Getter method for balance
    public double getBalance(){
        return balance;
    }

    // Setter method for balance
    public void setBalance(double balance){
        this.balance = balance;
    }

    // Setter method for name
    public void setName(String name){
        this.name = name;
    }

    // Method to deposit an amount to the account
    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited " + amount + " to " + name);
    }

    // Method to withdraw an amount from the account
    public void withdraw(double amount){
        balance -= amount;
        System.out.println("Withdrawn " + amount + " from " + name);
    }
}
