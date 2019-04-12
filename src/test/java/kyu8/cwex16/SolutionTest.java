package kyu8.cwex16;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void testBob() {
        assertEquals("Should return 0.", 0, Bob.enough(10, 5, 5));
        assertEquals("Should return 10.", 10, Bob.enough(100, 60, 50));
    }
}
