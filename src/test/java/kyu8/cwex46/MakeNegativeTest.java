package kyu8.cwex46;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MakeNegativeTest {

    @Test
    public void test1() {
        assertEquals(-42, Kata.makeNegative(42));
    }
    @Test
    public void test2() {
        assertEquals(-42, Kata.makeNegative(-42));
    }
    @Test
    public void test3() {
        assertEquals(0, Kata.makeNegative(0));
    }
}
