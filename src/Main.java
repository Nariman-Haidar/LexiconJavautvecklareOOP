public class Main {
    public static void main(String[] args) {


        // Create and open new accounts
        LexBank.oppenAcount("Naro");
        LexBank.oppenAcount("Modi");
        LexBank.oppenAcount("Saso");
        LexBank.oppenAcount("Lolo");

        // Print details of all accounts
        LexBank.printAccounts();

        // Perform deposit and withdraw operations on each account
        for (LexAccount account : LexBank.accounts) {
            account.deposit(100);
            account.withdraw(50);
        }

        // Print details of all accounts after transactions
        LexBank.printAccounts();
    }
}
