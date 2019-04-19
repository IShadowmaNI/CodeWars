package kyu8.cwex55;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class KataTest {
    @Test
    public void testToBinary() {
        assertEquals(1, Kata.toBinary(1));
        assertEquals(10, Kata.toBinary(2));
        assertEquals(11, Kata.toBinary(3));
        assertEquals(101, Kata.toBinary(5));
    }
}
