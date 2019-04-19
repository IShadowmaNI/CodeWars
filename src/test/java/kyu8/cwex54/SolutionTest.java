package kyu8.cwex54;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

public class SolutionTest {
    @Test
    public void testSomething1() {
        assertEquals(6, Kata.grow(new int[]{1,2,3}));
    }
    @Test
    public void testSomething2() {
        assertEquals(16, Kata.grow(new int[]{4,1,1,1,4}));
    }
    @Test
    public void testSomething3() {
        assertEquals(64, Kata.grow(new int[]{2,2,2,2,2,2}));
    }



}
