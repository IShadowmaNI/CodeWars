package kyu8.cwex41;

import static org.junit.Assert.*;
import org.junit.Test;

public class WilsonPrimeTest {
    @Test
    public void test1() {
        assertFalse(WilsonPrime.am_i_wilson(0));
    }
    @Test
    public void test2() {
        assertFalse(WilsonPrime.am_i_wilson(1));
    }
    @Test
    public void test3() {
        assertTrue(WilsonPrime.am_i_wilson(5));
    }
    @Test
    public void test4() {
        assertTrue(WilsonPrime.am_i_wilson(563));
    }
    @Test
    public void test5() {
        assertTrue(WilsonPrime.am_i_wilson(521));
    }
}
