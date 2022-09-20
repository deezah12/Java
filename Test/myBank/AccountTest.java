package myBank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    Account bankeAccount;

    @BeforeEach
    void  setUp(){
       bankeAccount = new Account("0987888", "banke", "1212");
    }

    @Test
    void accountCanBeCreatedTet(){
        // given that account exists
        //check that account exists
        // check that balance is zero
        assertNotNull(bankeAccount);
        assertEquals(0,bankeAccount.getBalance("1212"));
    }

    @Test
    void depositMoney_balanceIncreasesTest(){
        //given i have an account andthe balance is zero
        //when i try to deposit 200
        // check that balance is zero
        assertEquals(0, bankeAccount.getBalance("1212"));
        bankeAccount.deposit(200);
        assertEquals(200, bankeAccount.getBalance("1212"));
    }
    @Test
     void cannotDepositNegativeAmountTest(){
        //given that i have an account and balance is zero.
       // when i try to deposit -2500.
        //check that balance i zero.
        assertEquals(0, bankeAccount.getBalance("1212"));
        bankeAccount.deposit(-2500);

        assertEquals(0, bankeAccount.getBalance("1212"));
    }
    @Test
    void depositNegativeAmountThrowsAnException(){
        assertThrows(InvalidAmountException.class, ()->bankeAccount.deposit(-2500));
    }
    @Test
    void thatYouCanNotWithdrawMoreThanYourBalance(){
        bankeAccount.deposit(2000);
        bankeAccount.withdraw(2500,"1212");
        assertEquals(2000 ,bankeAccount.getBalance("1212"));
    }
    @Test
    @DisplayName("Getting balance with invalid pin")
    void getBalanceWithWrongPin(){
        bankeAccount.deposit(2000);
       // bankeAccount.withdraw(1000);
        int myBalance = bankeAccount.getBalance("1210");
        assertEquals(0, myBalance);
    }
    @Test
    void thatWhenYouWithdrawYourBalanceWillDecrease(){
        bankeAccount.deposit(2000);
        bankeAccount.withdraw(1500,"1212");
        assertEquals(500, bankeAccount.getBalance("1212"));
    }
    @Test
    void withdrwaWithTheRightPin(){
        bankeAccount.deposit(4000);
        bankeAccount.withdraw(3000,"1212");
       // assertEquals(2000,bankeAccount.getBalance("1212"));
       // int myBalance = bankeAccount.getBalance("1212");
        assertEquals(1000, bankeAccount.getBalance("1212"));
    }

    @Test
    @DisplayName("if pin is correct and amount exceeds balance withdrawal doesnt work")
    void withdrawWithTheRightPinAndHigherAmount(){
        bankeAccount.deposit(5000);
        bankeAccount.withdraw(10000,"1212");
        assertEquals(5000, bankeAccount.getBalance("1212"));
    }

}
