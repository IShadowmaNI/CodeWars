package kyu8.cwex10;

import static org.junit.Assert.*;
import org.junit.Test;

public class DivisibleNbTests {

    @Test
    public void test1() {
        assertTrue(DivisibleNb.isDivisible(12, 4, 3));
    }
    @Test
    public void test2() {
        assertFalse(DivisibleNb.isDivisible(3, 3, 4));
    }

}
