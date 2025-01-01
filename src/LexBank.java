import java.util.ArrayList;
import java.util.List;

public class LexBank {
    // List to store LexAccount objects
    public static List<LexAccount> accounts = new ArrayList<>();
    public static long accountNumber = 0;

    // Constructor for LexBank
    private LexBank() {
    }

    // Method to open a new account with the given name
    public static long oppenAcount(String name) {
        LexAccount account = new LexAccount(name, generateAccountNumber());
        accounts.add(account);
        System.out.println("Account created for " + name);
        return account.getAccountNumber();
    }

    // Method to get an account by accountNumber.
    public static LexAccount getAccount(long accountNumber) {
        try {
            for (LexAccount account : accounts) {
                if (account.getAccountNumber() == accountNumber) {
                    return account;
                }
            }
            throw new Exception("Account Not Found");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    // Method to transfer between accounts that takes account numbers and amount as arguments
    public static boolean accountTransfer(long fromAcc, long toAcc, double amount) {
        try {
            LexAccount fromAccount = getAccount(fromAcc);
            LexAccount toAccount = getAccount(toAcc);

            if (fromAccount == null || toAccount == null) {
                System.out.println("One or both accounts not found.");
                return false;
            }

            if (fromAccount.getBalance() < amount) {
                System.out.println("Insufficient funds in the source account.");
                return false;
            }

            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("Transfer successful from " + fromAccount.getName() + " to " + toAccount.getName());
            return true;
        } catch (Exception e) {
            System.out.println("Error during transfer: " + e.getMessage());
            return false;
        }
    }


    // Method to print details of all accounts
    public static void printAccounts() {
        for (LexAccount account : accounts) {
            System.out.println("Account: " + account.getName() + " Balance: " + account.getBalance());
        }
    }

    // A private method to generate uniqe account number
    private static long generateAccountNumber() {
        return accountNumber++;
    }

    //
}
