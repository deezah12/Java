package myBank;

import java.util.Scanner;

import static java.lang.System.exit;

public  class Atm {
    private  static Bank oniranuBank = new Bank();
    public static void main(String[] args) {
    startAtm();
    }

    private static  void startAtm(){
        String mainMenu = """
                Welcome To Oniranu Bank
                1 -> Create Account
                2 -> Deposit Account
                3 -> Withdraw
                4 -> Transfer
                5 -> Exit
                
                """;
        String userInput = input(mainMenu);
        switch (userInput){
            case "1" -> createAccount();
            case "2" -> deposit();
            case "3" -> withdraw();
            case "4" -> transfer();
            case "5" -> checkBalance();
            case "6" -> exit(6);
        }
    }



    private static void transfer() {
    }

    private static void withdraw() {

    }

    private static void deposit() {
        String accountNumber = input("Enter your account number");
        int amount = inputInt("Enter Amount") ;
        try{
            oniranuBank.deposit(amount, accountNumber);
        }
        catch (InvalidAmountException ex){
            display(ex.getMessage());
            deposit();
        }
        startAtm();
    }

    private static int inputInt(String prompt) {
        display(prompt);
        Scanner scanner = new Scanner(System.in);
        return  scanner.nextInt();

    }

    private static void createAccount() {
        String accountName = input ("Enter your account name");
        String pin = input ("Enter your desired pin");
        oniranuBank.createAccountFor(accountName, pin);
        display(String.format("Account created for %s", accountName));
        startAtm();
    }
    private static void checkBalance() {
        String accountName = input ("Enter your account name");
        String pin = input ("Enter your desired pin");
        display(String.format("Balance is %d", oniranuBank.findAccount(accountName).getBalance(pin)));
        startAtm();

    }

    private static String input(String prompt) {
        display(prompt);
        Scanner scanner = new Scanner(System.in);
        return  scanner.nextLine();
    }
    private  static  void display(String prompt){
        System.out.println(prompt);
    }
}

