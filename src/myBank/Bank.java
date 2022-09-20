package myBank;

public class Bank {

    private int numberOfCustomer;
    private Account[] accounts = new Account[10];

    public void createAccountFor(String accountName, String pin) {
        Account account = new Account((numberOfCustomer+1)+"", accountName, pin);
        accounts[numberOfCustomer]= account;
        numberOfCustomer++;
    }

    public int getNumberofCutomers() {
        return numberOfCustomer;
    }

    public Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getNumber().equals(accountNumber))
                return account;
        }
        return null;
    }

    public void deposit(int amount, String accountNumber) {
        Account account = findAccount(accountNumber);
        account.deposit(amount);

    }

    public void withdraw(int amount, String accountNumber, String pin) {
        Account account = findAccount(accountNumber);
        account.withdraw(amount, pin);
    }

    public void transfer(String sender, String receiver, int amount, String pin) {
        Account senderAccount = findAccount(sender);
        Account receiverAccount = findAccount(receiver);

        senderAccount.withdraw(amount, pin);
        receiverAccount.deposit(amount);
    }
}
