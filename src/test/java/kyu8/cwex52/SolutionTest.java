package kyu8.cwex52;

import org.junit.Test;
import static org.junit.Assert.*;

// TODO: Replace examples and use TDD development by writing your own tests

public class SolutionTest {
    @Test
    public void fixedTests() {
        assertTrue(Kata.isDivisible(4050,27));
        assertTrue(Kata.isDivisible(10000,20));
        assertTrue(Kata.isDivisible(10005,1));
        assertFalse(Kata.isDivisible(4066,27));
        assertFalse(Kata.isDivisible(10005,2));
    }
}
