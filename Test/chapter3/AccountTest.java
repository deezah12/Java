package chapter3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account jacob;

    @BeforeEach
    void setUp(){
        jacob = new Account("jacob","2345678","2022");
    }

    @Test
    void testThatAccountCanBeCreated(){
        assertNotNull(jacob);
    }

    @Test
    void testThatBalanceIsZero(){
       assertEquals(0, jacob.getBalance("2022"));

    }

    @Test
    void customerCanDepositAndBalanceIncreases(){
        jacob.deposit(5000.0);
        assertEquals(5000.0, jacob.getBalance("2022"));
    }

    @Test
    void customeCanWithdraw(){
        jacob.deposit(5000.0);
        jacob.withdraw(2000.0, "2022");
        assertEquals(3000.0, jacob.getBalance("2022"));
    }

    @Test
    void customerCannotDepositNegativeValue(){
        jacob.deposit(-5000.0);
        assertEquals(0.0, jacob.getBalance("2022"));
    }

    @Test
    void customerCannotWithdrawMoreThanBalance(){
        jacob.deposit(5000.0);
        jacob.withdraw(10_000.0, "2022");
        assertEquals(5000.0, jacob.getBalance("2022"));
    }

    @Test
    void cutomerCannotWithrawWithWrongPin(){
        jacob.deposit(5000.0);
        jacob.withdraw(3000.0, "2012");
        assertEquals(5000.0, jacob.getBalance("2022"));
    }
    @Test
    void customerCannotWithdrawMoreThanBalanceWithRightPin(){
        jacob.deposit(5000.0);
        jacob.withdraw(10_000.0, "2022");
        assertEquals(5000.0, jacob.getBalance("2022"));
    }


}