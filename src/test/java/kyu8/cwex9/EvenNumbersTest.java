package kyu8.cwex9;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumbersTest
{

    @Test public void testSimple()
    {
        assertArrayEquals(new int[]{2, 4, 6}, EvenNumbers.divisibleBy(new int[] {1, 2, 3, 4, 5, 6}, 2));
        assertArrayEquals(new int[]{3, 6}, EvenNumbers.divisibleBy(new int[]{1, 2, 3, 4, 5, 6}, 3));
        assertArrayEquals(new int[]{0, 4}, EvenNumbers.divisibleBy(new int[]{0, 1, 2, 3, 4, 5, 6}, 4));
    }
}
