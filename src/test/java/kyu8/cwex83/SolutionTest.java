package kyu8.cwex83;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class SolutionTest {
    @Test
    public void testSomething() {
        assertTrue(Kata.zeroFuel(50, 25, 2));
        assertFalse(Kata.zeroFuel(100, 50, 1));
    }
}
