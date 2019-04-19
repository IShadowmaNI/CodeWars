package kyu8.cwex61;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void basicTest1() {
        assertEquals("apple", Kata.subtractSum(10));
    }
    @Test
    public void basicTest2() {
        assertEquals("apple", Kata.subtractSum(103));
    }
    @Test
    public void basicTest3() {
        assertEquals("pear", Kata.subtractSum(250));
    }
    @Test
    public void basicTest4() {
        assertEquals("apple", Kata.subtractSum(2239));
    }
}

