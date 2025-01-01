import java.util.ArrayList;
import java.util.List;

public class LexBank {
    // List to store LexAccount objects
    public static List<LexAccount> accounts = new ArrayList<>();

    // Constructor for LexBank
    private LexBank() {}

    // Method to open a new account with the given name
    public static void oppenAcount(String name) {
        LexAccount account = new LexAccount(name);
        accounts.add(account);
        System.out.println("Account created for " + name);
    }

    // Method to print details of all accounts
    public static void printAccounts() {
        for (LexAccount account : accounts) {
            System.out.println("Account: " + account.getName() + " Balance: " + account.getBalance());
        }
    }
}
