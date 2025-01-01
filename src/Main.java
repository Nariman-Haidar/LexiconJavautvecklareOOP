public class Main {
    public static void main(String[] args) {


        // Create and open new accounts
        long account1 = LexBank.oppenAcount("NN");
        long account2 = LexBank.oppenAcount("MM");

        //LexBank.printAccounts();
        // Perform deposit and withdraw operations on each account


        LexBank.getAccount(account1).deposit(100);
        LexBank.getAccount(account2).deposit(50);
        LexBank.printAccounts();


        // Test transfers between accounts
        LexBank.accountTransfer(account1, account2, 50);
        LexBank.accountTransfer(account1, account2, 200);
        // Should fail
        // Print details of all accounts after transactions
        LexBank.printAccounts();


    }
}
