package chapter3;

public class Account {
    public Account(String accountName, String accountNumber, String pin) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.pin = pin;
    }

    private String accountName;
    private String accountNumber;
    private String pin;
    private  double balance;


    public void deposit(double amount) {
        if(amount > 0)
            balance += amount;

    }
    public double getBalance(String pin) {
        boolean isValid = pin.equals(this.pin);
        if (isValid) {
            return balance;
        }
        return 0;
    }


    public void withdraw(double amount, String pin) {
        boolean isValid = pin.equals(this.pin);
        boolean isGood = balance > amount && amount > 0;
        if(isValid && isGood) balance -= amount;


        }

    }

