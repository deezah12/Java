package myBank;

public class Account {


    private int balance;
        private String number;
        private String pin;
        private String name;

        public Account(String accountNumber,String accountName, String accountPin){
            pin = accountPin;
            name = accountName;
            number = accountNumber;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance(String pin){
            if (isCorrect(pin)) return balance;
            return 0;
    }
    public void deposit(int amount) {
        boolean isValid = amount > 0;
        if (!isValid) throw new InvalidAmountException("you cannot deposit with a negative amount");
        balance += amount;
    }

    public void withdraw(int amount, String pin) {
        boolean isValid = balance > amount && amount > 0;
        if (isCorrect(pin) && isValid ) balance -= amount;
    }

    private boolean isCorrect(String pin){
             if (pin.equals(this.pin)) return true;
            return false;

    }

    public String getNumber() {
            return  number;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

