import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {
    Prime prime = new Prime();

    @Test
    void testPrime(){
        prime = new Prime();
        assertTrue(prime.isPrime(79));
    }

    @Test
    void testThatNumberIsNotPrime(){
        prime = new Prime();
        assertFalse(prime.isPrime(9));
    }
}