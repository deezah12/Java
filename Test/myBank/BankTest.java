package myBank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BankTest {
   private Bank fcmb;

    @BeforeEach
    void setUp(){
        fcmb = new Bank();
    }

   @Test
    void testThatBankExists(){
       Bank  fcmb = new Bank();
       assertNotNull(fcmb);
       //assertNotEquals(null, fcmb);
   }
   @Test
    void testThatAccountCanBeCreated() {
       fcmb.createAccountFor("banke celina owolabi", "1212");
       assertEquals(1, fcmb.getNumberofCutomers());

       Account account = fcmb.findAccount("1");
       assertEquals("banke celina owolabi", account.getName());
   }

   @Test
    void customerCanDepositInHerAccountTest(){
        fcmb.createAccountFor("banke celina owolabi", "1212");
        fcmb.deposit(2000, "1");

        Account bankeAccount = fcmb.findAccount("1");
        assertEquals(2000, bankeAccount.getBalance("1212"));
   }
   @Test
    void customerCanWithdrawInHerAccountTest(){
       fcmb.createAccountFor("banke celina owolabi", "1212");
       fcmb.deposit(3000, "1");
      Account bankeAccount = fcmb.findAccount("1");
       fcmb.withdraw(1000,"1", "1212");
       assertEquals(2000, bankeAccount.getBalance("1212"));

   }

   @Test
    void customerCanNotWithdrawMoreThanBlance(){
       fcmb.createAccountFor("banke celina owolabi", "1212");
       fcmb.deposit(3000, "1");
       Account bankeAccount = fcmb.findAccount("1");
       fcmb.withdraw(5000,"1", "1212");
       assertEquals(3000, bankeAccount.getBalance("1212"));

   }
   @Test
    void customerCanNotWithdrawNegativeAmount(){
       fcmb.createAccountFor("banke celina owolabi", "1212");
       fcmb.deposit(3000, "1");
       Account bankeAccount = fcmb.findAccount("1");
       fcmb.withdraw(-5000,"1", "1212");
       assertEquals(3000, bankeAccount.getBalance("1212"));
   }
   @Test
    void  customerCanNotWithdrawWithWrongPin(){
       fcmb.createAccountFor("banke celina owolabi", "1212");
       fcmb.deposit(3000, "1");
       Account bankeAccount = fcmb.findAccount("1");
       fcmb.withdraw(2000,"1", "1210");
       assertEquals(3000, bankeAccount.getBalance("1212"));
   }
   @Test
    void customerCanTransfer(){
        fcmb.createAccountFor("Hadiza", "2020");
        fcmb.createAccountFor("Umar", "2021");

        fcmb.deposit(5000, "1");
        assertEquals(5000, fcmb.findAccount("1").getBalance("2020"));

        fcmb.transfer("1", "2",4900,"2020");
        assertEquals(100, fcmb.findAccount("1").getBalance("2020"));
        assertEquals(4900, fcmb.findAccount("2").getBalance("2021"));

   }
}