package kyu8.cwex97;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class FactorTest {
    @Test
    public void basicTests() {
        assertTrue(Kata.checkForFactor(10, 2));
        assertTrue(Kata.checkForFactor(63, 7));
        assertTrue(Kata.checkForFactor(2450, 5));
        assertTrue(Kata.checkForFactor(24612, 3));
    }
}
